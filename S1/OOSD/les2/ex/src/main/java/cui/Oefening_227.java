package cui;

import java.util.Scanner;

public class Oefening_227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1, tmp;
        int[] aantal = new int[4];
        while (cnt <= 15){
            System.out.print("Geef antwoord " + cnt + "in (1, 2, 3 of 4): " );
            tmp = sc.nextInt();
            if (tmp < 1 || tmp > 4){
                System.out.println("Foutieve waarde! Probeer opnieuwe!");
                continue;
            }
            cnt++;
            aantal[tmp-1]++;
        }
        for( int i = 0; i<aantal.length; i++)
            System.out.println("Aantal " + (i+1) + " = " + aantal[i]);
    }
}
