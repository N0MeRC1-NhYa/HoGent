package cui;

import java.util.Scanner;

public class Oefening_8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a, b, c;
        System.out.print("Geef eerste taal: ");
        a = in.nextInt();
        System.out.print("Geef eerste taal: ");
        b = in.nextInt();
        System.out.print("Geef eerste taal: ");
        c = in.nextInt();
        System.out.printf("De vermenigvuldiging van %d, %d en %d is %d%n",a , b , c, a * b * c );
    }
}
