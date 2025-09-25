package cui;

import java.util.Scanner;

public class Oefening_214 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("geef een gehele getal in: ");
        int a = sc.nextInt();
        if (a % 2 == 0)
            System.out.printf("Het ingevoerde getal %d is een even getal", a);
        else
            System.out.printf("Het ingevoerde getal %d is een oneven getal", a);
    }
}
