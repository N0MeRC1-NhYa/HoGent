package cui;

import java.util.Scanner;

public class Oefening_218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oefening_218 o = new Oefening_218();
        o.oef1(sc);
        o.oef2(sc);
    }

    private void oef1(Scanner sc) {
        int a;
        do {
            System.out.print("Geef een strijkt negatieve oneven getal in: ");
            a = sc.nextInt();
        } while (a > 0 || a % 2 == 0);
        System.out.printf("Getal %d zijn in gebruik%n", a);
    }

    private void oef2(Scanner sc) {
        int a;
        int b;
        do {
            System.out.print("Geef een getal dat verschillend van 1000 en mag niet deelbaar zijn door 12 in: ");
            a = sc.nextInt();
            System.out.print("Geef een andere getal dat groter zijn van het eerste: ");
            b = sc.nextInt();
        } while (a % 12 == 0 || a == 1000 || a >= b);
        System.out.printf("Getallen %d en %d zijn in gebruik%n", a, b);
    }
}
