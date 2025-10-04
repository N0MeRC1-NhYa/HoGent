package domein;

public class Rekening {

    private long rekeningNummer;
    private double saldo;
    private String naamHouder;

    public Rekening(){

    }

    public Rekening(long rekeningNummer){

    }

    public Rekening(long rekeningNummer, String naamHouder){

    }

    public void setRekeningNummer(long rekeningNummer){

    }

    public boolean stort(){
        return false;
    }

    public boolean haalAf(double bedrag){
        return false;
    }
}
