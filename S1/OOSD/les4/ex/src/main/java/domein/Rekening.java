package domein;

public class Rekening {

    private long rekeningNummer;
    private double saldo;
    private String naamHouder;

    public Rekening(){
        this.rekeningNummer = 123_456_789;
        this.saldo = 0;
        this.naamHouder = "onbekend";
    }

    public Rekening(long rekeningNummer){
        setRekeningNummer(rekeningNummer);
        this.saldo = 0;
        this.naamHouder = "onbekend";
    }

    public Rekening(long rekeningNummer, String naamHouder){
        setRekeningNummer(rekeningNummer);
        setNaamHouder(naamHouder);
        this.saldo = 0;
    }

    public void setRekeningNummer(long rekeningNummer){
        this.rekeningNummer = rekeningNummer;
    }

    public boolean stort(double bedrag){
        if (bedrag > 0)
            this.saldo += bedrag;
        return bedrag > 0;
    }

    public boolean haalAf(double bedrag){
        if (this.saldo >= bedrag && bedrag > 0) {
            this.saldo -= bedrag;
            return true;
        }
        return false;
    }

    public String getNaamHouder() {
        return naamHouder;
    }

    public void setNaamHouder(String naamHouder) {
        this.naamHouder = naamHouder;
    }

    public long getRekeningNummer() {
        return this.rekeningNummer;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
