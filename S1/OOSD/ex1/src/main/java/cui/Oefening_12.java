package cui;

import java.util.Scanner;

public class Oefening_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 10;
        double b = 0.5;
        System.out.print("Geef de hoogte van de muur: ");
        double h = sc.nextDouble();
        System.out.print("Geef de breedte van de muur: ");
        double w = sc.nextDouble();
        System.out.printf("Het aantaal benodigde rollen = %.1f", h * w / (a * b));
    }
}
