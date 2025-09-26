package cui;

import java.util.Scanner;

public class Oefening_230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een pos geheel getal (0 om te stoppen): ");
        int tmp = sc.nextInt();
        int priem_cnt = 0;
        while (tmp != 0) {
            if (tmp > 0) {
                int delers_cnt = 0;
                for (int i = 2; i * i <= tmp; i++) {
                    if (tmp % i == 0)
                        delers_cnt++;
                }
                if (delers_cnt > 0 || tmp == 1)
                    System.out.println(tmp + " is GEEN priemgetal!");
                else {
                    System.out.println(tmp + " is EEN priemgetal!");
                    priem_cnt++;
                }
            }
            System.out.print("Geef een pos geheel getal (0 om te stoppen): ");
            tmp = sc.nextInt();
        }
        System.out.println("Het aantal priemgetallen is " + priem_cnt);
    }
}
