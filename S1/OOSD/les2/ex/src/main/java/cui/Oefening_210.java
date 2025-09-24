package cui;

import java.util.Scanner;

public class Oefening_210 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Geef eerste getal in: ");
        int a =sc.nextInt();
        int max = 0;
        System.out.print("Geef tweede getal in: ");
        int b =sc.nextInt();
        if (max<b)
            max = b;
        System.out.print("Geef derde getal in: ");
        int c =sc.nextInt();
        if (max<c)
            max = c;
        System.out.printf("Van de ingevoerde getallen %d, %d en %d%n", a , b, c);
        System.out.printf("is de som %d%n", a + b + c);
        System.out.printf("het gemiddelde %d%n", (a + b + c) / 3);
        System.out.printf("en de rest %d%n", (a + b + c) % 3);
        System.out.printf("en het grootste getal %d%n", max);
    }
}