package cui;

import java.util.Scanner;

public class Oefening_217 {
    public static void main(String[] args) {
        Oefening_217 o = new Oefening_217();
        Scanner in = new Scanner(System.in);
        o.oef1(in);
        o.oef2(in);
    }

    private void oef1(Scanner in) {
        double n_sum = 0;
        int n_cnt = 0;
        System.out.print("Geef een getal (0 om te stoppen): ");
        int a = in.nextInt();
        while (a !=  0){
           if (a < 0){
               n_sum += a;
               n_cnt++;
           }
           System.out.print("Geef een getal (0 om te stoppen): ");
           a = in.nextInt();
        }
        if (n_sum == 0){
            System.out.println("Er werden geen negatieve getallen ingevoerd!");
            return;
        }
        System.out.printf("Het gemiddelde van alle negatieve getallen is %.1f%n", n_sum/n_cnt);
    }

    private void oef2(Scanner in) {
        System.out.print("Geef een getal (0 om te stoppen): ");
        int a = in.nextInt();
        int max = 0;
        int min = a;
        while (a !=  0){
            if (min > a )
                min = a;
            if (max < a )
                max = a;
            System.out.print("Geef een getal (0 om te stoppen): ");
            a = in.nextInt();
        }
        if (max == 0){
            System.out.println("Er werden geen geldige getallen ingevoerd!");
            return;
        }
        System.out.printf("Het grootste van alle ingevoerde getallen is %d.%nHet kleinste is %d.%n", max, min);
    }
}
