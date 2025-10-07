package domein;

public class Rechthoek {

    public final static double STANDAARD_WAARDE = 1;

    private double lengte = STANDAARD_WAARDE;
    private double breedte = STANDAARD_WAARDE;

    public Rechthoek(){
        setBreedte(7.0);
        setLengte(10.0);
    };

    public Rechthoek(double lengte, double breedte){
        setBreedte(breedte);
        setLengte(lengte);
    }

    public double berekenOmtrek(){
        return 2  * (this.breedte + this.lengte);
    }

    public double berekenOppervlakte(){
        return this.breedte * this.lengte;
    }

    private void setLengte(double lengte){
        this.lengte = lengte > 0 ? lengte : STANDAARD_WAARDE;
    }

    private void setBreedte(double breedte){
        this.breedte = breedte > 0 ? breedte : STANDAARD_WAARDE;
    }

    public double getLengte() {
        return this.lengte;
    }

    public double getBreedte() {
        return this.breedte;
    }
}
