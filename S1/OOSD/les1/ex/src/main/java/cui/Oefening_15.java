package cui;

import java.util.Scanner;

public class Oefening_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Geef eerste getal in: ");
        int a =sc.nextInt();
        System.out.print("Geef tweede getal in: ");
        int b =sc.nextInt();
        System.out.print("Geef derde getal in: ");
        int c =sc.nextInt();
        System.out.printf("Van de ingevoerde getallen %d, %d en %d%n", a , b, c);
        System.out.printf("is de som %d%n", a + b + c);
        System.out.printf("het gemiddelde %d%n", (a + b + c) / 3);
        System.out.printf("en de rest %d%n", (a + b + c) % 3);
    }
}
