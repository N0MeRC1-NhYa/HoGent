package domein;

public class Marktkraam {

    private String kraamhouder;
    private int breedte;
    private double inkomsten;

    public Marktkraam(String kraamhouder, int breedte){
        setKraamhouder(kraamhouder);
        setBreedte(breedte);
    }

    private void setKraamhouder(String kraamhouder){
        this.kraamhouder = kraamhouder == null || kraamhouder.trim().isEmpty() ? "anoniem" : kraamhouder;
    }

    public String getKraamhouder(){
        return this.kraamhouder;
    }

    private void setBreedte(int breedte){
        this.breedte = breedte > 10 || breedte < 2 ? 10 : breedte;
    }

    public int getBreedte(){
        return this.breedte;
    }

    public void ontvang(double bedrag){
            this.inkomsten += bedrag > 0 ? bedrag : 0;
    }

    public double geefWinst(){
        return this.inkomsten - this.breedte * (this.breedte > 5 ? 2.5 : 3);
    }

}
