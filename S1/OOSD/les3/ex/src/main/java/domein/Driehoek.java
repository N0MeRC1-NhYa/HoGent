package domein;

public class Driehoek {

    public static final int STANDAARD_WAARDE = 1;

    private int a = STANDAARD_WAARDE;
    private int b = STANDAARD_WAARDE;
    private int c = STANDAARD_WAARDE;

    public Driehoek(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

    private void setA(int a) {
        this.a = a > 0 ? a : STANDAARD_WAARDE;
    }

    private void setB(int b) {
        this.b = b > 0 ? b : STANDAARD_WAARDE;
    }

    private void setC(int c) {
        this.c = c > 0 ? c : STANDAARD_WAARDE;
    }

    public boolean isRechthoekig(){
        return a * a == b * b + c * c ||
                b * b == a * a + c * c ||
                c * c == a * a + b * b;
    }

    public int getA() {
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public int getC() {
        return this.c;
    }
}
