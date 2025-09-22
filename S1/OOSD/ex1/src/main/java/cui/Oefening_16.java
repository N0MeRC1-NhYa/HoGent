package cui;

import java.util.Scanner;

public class Oefening_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een positief getal in: ");
        int a = sc.nextInt();
        System.out.printf("octale notatie = %o%n", a);
        System.out.printf("hexidecimale notatie (klein) = %x%n", a);
        System.out.printf("hexidecimale notatie (groot) = %X%n", a);
    }
}
