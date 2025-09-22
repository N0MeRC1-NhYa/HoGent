package cui;

import java.util.Scanner;

public class Oefening_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef de lengte van de rechthoek: ");
        int a = sc.nextInt();
        System.out.print("Geef de breedte van de rechthoek: ");
        int b = sc.nextInt();
        System.out.println("De omtrek is: " + (2 * a + 2 * b));
        System.out.println("De oppervlakte is: " + (a * b));
    }
}
