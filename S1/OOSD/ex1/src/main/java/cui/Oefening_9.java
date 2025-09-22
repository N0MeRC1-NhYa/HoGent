package cui;

import java.util.Scanner;

public class Oefening_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef maandsalaris in euro: ");
        double ms = sc.nextDouble();
        System.out.printf("jaarsalaris: %.2f%n", ms * 12);
        System.out.printf("vakantiegeld: %.2f%n", ms * 0.08 * 12);
    }
}
