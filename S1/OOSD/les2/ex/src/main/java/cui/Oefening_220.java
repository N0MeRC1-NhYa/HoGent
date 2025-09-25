package cui;

import java.util.Scanner;

public class Oefening_220 {
    public static void main(String[] args) {
        System.out.println("het programma rekent gemiddeld van de ingevoerde getallen.");
        double sum = 0;
        int cnt = 0;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        do{
            sum += a;
            System.out.print("Geef een gehele getal in: ");
            a = sc.nextInt();
            cnt++;
        } while (cnt < 10 && a != -1);
        if (a != -1)
            sum += a;
        else
            cnt--;
        if (sum == 0)
            System.out.println("Geen getallen werden ingegeven!");
        else
            System.out.printf("De gemiddeld van het invoer is: %.2f", sum / cnt);
    }
}
