package cui;

import java.util.Scanner;

public class Oefening_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een prijs in (kommagetal): ");
        double kommagetal = sc.nextDouble();
        System.out.print("Geef een kortingspercentage (=geheel getal): ");
        int korting = sc.nextInt();
        System.out.printf("%f € met %d%% korting is: %f%n",
                kommagetal, korting, kommagetal*(100 - korting) / 100);
        System.out.printf("%.2f € met %d%% korting is: %.2f%n",
                kommagetal, korting, kommagetal*(100 - korting) / 100);
    }
}
