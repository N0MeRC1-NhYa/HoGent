package cui;

import java.util.Scanner;

public class Oefening_228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1, tmp = -1;
        int[] aantal = new int[4];
        while (tmp != 0){
            System.out.print("Geef antwoord " + cnt + "in (1, 2, 3 of 4), STOP met 0: " );
            tmp = sc.nextInt();
            if (tmp < 0 || tmp > 4){
                System.out.println("Foutieve waarde! Probeer opnieuwe!");
            } else if (tmp != 0) {
                cnt++;
                aantal[tmp - 1]++;
            }
        }
        for( int i = 0; i<aantal.length; i++)
            System.out.println("Aantal " + (i+1) + " = " + aantal[i]);
    }
}
