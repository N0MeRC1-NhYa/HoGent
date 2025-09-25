package cui;

public class Oefening_219 {
    public static void main(String[] args) {
        int l_am = 50;
        int jaar = 0;
        while (l_am < 1000){
            jaar++;
            l_am*=1.15;
        }
        System.out.println("Jaar: " + jaar);
    }
}
