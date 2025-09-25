package cui;

import java.util.Scanner;

public class Oefening_225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, tmp, cnt = 0, res_cnt = 0;
        do {
            System.out.print("Geef een strikt positieve deler in: ");
            a = sc.nextInt();
        } while (a <= 0);

        do {
            cnt++;
            System.out.printf("Geef positief getal %d in (of stop met -1): ", cnt);
            tmp = sc.nextInt();
            if (tmp != -1 && tmp % a == 0)
                res_cnt++;
        } while (tmp != -1);
        if (res_cnt == 1)
            System.out.printf("Er is %d getal deelbaar door %d", res_cnt, a);
        else
            System.out.printf("Er zijn %d getallen deelbaar door %d", res_cnt, a);
    }
}
