package cui;

import java.util.Scanner;

public class Oefening_226 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        do {
            System.out.print("Geef een strikt positief geheel getal in: ");
            a = sc.nextInt();
        } while (a <= 0);
        int cnt = 0;
        while(a != 1){
            cnt++;
            if (a % 2 == 0)
                a/=2;
            else
                a = 3 * a + 1;
        }
        System.out.println("Het getal wijzigt " + cnt + " keer");
    }
}
