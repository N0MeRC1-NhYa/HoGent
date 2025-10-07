package domein;

public class Product {

    public final static String NAAM_ONBEKEND = "naam onbekend";
    // To note that it works incorrectly int -> double 1 -> 1.48
    public final static double DEFAULT_PRIJS_EXCL_BTW = 1.48;
    public final static int ONDERGRENS_BTW = 6;
    public final static int BOVENGRENS_BTW = 21;
    public final static int BOVENGRENS_KORTING_STUKS = 50;
    private final static int MINIMUM_AANTAL_STUKS = 6;

    private String naam = NAAM_ONBEKEND;
    private double prijsExclBtw = DEFAULT_PRIJS_EXCL_BTW;
    private int btwPercentage = BOVENGRENS_BTW;
    private int kortingStucksPercentage;

    public Product(String naam, double prijsExclBtw, int btwPercentage, int kortingStucksPercentage){
        setNaam(naam);
        setPrijsExclBtw(prijsExclBtw);
        setBtwPercentage(btwPercentage);
        setKortingStucksPercentage(kortingStucksPercentage);
    }

    public int getBtwPercentage() {
        return btwPercentage;
    }

    public double getPrijsExclBtw() {
        return prijsExclBtw;
    }

    public void setPrijsExclBtw(double prijsExclBtw) {
        this.prijsExclBtw = prijsExclBtw > 0 ? prijsExclBtw : DEFAULT_PRIJS_EXCL_BTW;
    }

    public String getNaam() {
        return naam;
    }

    public double berekenPrijs(int aantal){
        double res = aantal * this.prijsExclBtw * (1 + (double)this.btwPercentage /100);
        if (aantal >= MINIMUM_AANTAL_STUKS)
            res *= (1 - (double) this.kortingStucksPercentage /100);
        return res;
    }

    public int getKortingStuksPercentage() {
        return kortingStucksPercentage;
    }

    private void setNaam(String naam){
        this.naam = naam != null && !naam.isEmpty() ? naam : NAAM_ONBEKEND;
    }

    private void setBtwPercentage(int btwPercentage){
        this.btwPercentage = btwPercentage >= ONDERGRENS_BTW && btwPercentage <= BOVENGRENS_BTW ? btwPercentage : BOVENGRENS_BTW;
    }

    private void setKortingStucksPercentage(int kortingStucksPercentage){
        this.kortingStucksPercentage = kortingStucksPercentage > 0 && kortingStucksPercentage <= 50 ? kortingStucksPercentage : 0;
    }

}
