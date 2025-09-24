package cui;

import java.util.Arrays;
import java.util.Scanner;

public class Oefening_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oefening_29 o = new Oefening_29();
        //o.oef_1(sc);
        //o.oef_2(sc);
        o.oef_3();
    }
    private void oef_1(Scanner sc){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Geef getal " + (i + 1) + ": ");
            sum += sc.nextInt();
        }
        System.out.println("De som van de getallen = " + sum);
    }

    private void oef_2(Scanner sc){
        int even_cnt = 0, deelbaar_3 = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Geef getal " + (i + 1) + ": ");
            int n = sc.nextInt();
            if (n % 2 == 0)
                even_cnt++;
            if (n % 3 == 0)
                deelbaar_3++;
        }
        System.out.printf("Je gaf %d even getallen en %d getallen deelbaar door 3 in.%n", even_cnt,  deelbaar_3);
    }

    private void oef_3(){
        int base = 10;
        System.out.printf("N\t%4d*N\t%4d*N\t%4d*N%n", base, base * base, base * base * base);
        for  (int i = 1; i <= 5; i++)
            System.out.printf("%d\t%4d\t%4d\t%4d%n", i, i * base, i * base * base, i * base * base * base);
    }
}
