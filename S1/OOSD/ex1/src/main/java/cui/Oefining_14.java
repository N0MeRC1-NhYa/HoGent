package cui;

import java.util.Scanner;

public class Oefining_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tens = {1, 10, 100, 1000, 10000};
        System.out.print("Geef een positief getal in: ");
        int n = sc.nextInt();
        for (int i : tens)
            System.out.printf("%15d", i);
        System.out.println();
        for (int i : tens)
            System.out.printf("%15d", i * n);
    }
}
