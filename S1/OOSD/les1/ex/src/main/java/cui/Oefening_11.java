package cui;

import java.util.Scanner;

public class Oefening_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een getal (>999 en <9999) in: ");
        int n = sc.nextInt();
        System.out.printf("%d duizendtallen%n", n / 1000);
        System.out.printf("%d honderdtallen%n", (n % 1000) / 100);
        System.out.printf("%d tientallen%n", (n % 100) / 10);
        System.out.printf("%d eenheden%n", n % 10);
    }
}
