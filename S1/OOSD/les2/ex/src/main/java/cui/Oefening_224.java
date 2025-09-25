package cui;

import java.util.Scanner;

public class Oefening_224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int del_2 = 0;
        int del_3 = 0;
        int del_6 = 0;
        System.out.print("Geef een positief geheel getal (stoppen met 0): ");
        a = sc.nextInt();
        while (a != 0) {
            if (a % 2 == 0) {
                del_2++;
                if (a % 3 == 0) {
                    del_3++;
                    del_6++;
                }
            }
            else if (a % 3 == 0)
                del_3++;
            System.out.print("Geef een positief geheel getal (stoppen met 0): ");
            a = sc.nextInt();
        }
        if (del_2 == 1)
            System.out.printf("Er is 1 getal deelbaar door 2%n");
        else
            System.out.printf("Er zijn %d getallen deelbaar door 2%n", del_2);
        if (del_3 == 1)
            System.out.printf("Er is 1 getal deelbaar door 3%n");
        else
            System.out.printf("Er zijn %d getallen deelbaar door 3%n", del_3);
        if (del_6 == 1)
            System.out.printf("Er is 1 getal deelbaar door 6%n");
        else
            System.out.printf("Er zijn %d getallen deelbaar door 6%n", del_6);
    }
}
