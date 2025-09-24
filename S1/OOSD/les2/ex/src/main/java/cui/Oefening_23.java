package cui;

import java.util.Scanner;

public class Oefening_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Oefening_23 o=new Oefening_23();
        o.oef_1(sc);
        o.oef_2(sc);
    }

    private void oef_1(Scanner sc){
        int i, k;
        System.out.print("Geef en gehele i:");
        i = sc.nextInt();
        k = switch (i) {
            case 1 -> 3;
            case 2 -> 6;
            case 3, 4 -> 10;
            default -> 20;
        };
        System.out.printf("k is %d%n", k);
    }

    private void oef_2(Scanner sc){
        System.out.print("Geef een gehele x: ");
        int x = sc.nextInt(), y = 0;
        switch (x) {
            case 100, 150, 170, 199 -> y++;
        }
        System.out.println("y is " + y);
    }
}
