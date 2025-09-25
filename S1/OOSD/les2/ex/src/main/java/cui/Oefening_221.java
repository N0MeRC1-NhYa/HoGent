package cui;

import java.util.Scanner;

public class Oefening_221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Geef een afstand in kilometer (strijkt positief geheel getal): ");
            a = sc.nextInt();
        } while (a <= 0);
        for (int s = 40; s <= 140; s += 10){
            System.out.printf("%d km\t%3d km\\u\t%d u %d min%n", a, s,  a / s, (int)(((double)a / s) * 60));
        }
    }
}
