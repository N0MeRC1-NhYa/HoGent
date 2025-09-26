package cui;

import java.util.Scanner;

public class Oefening_229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = -1, pre_tmp = Integer.MIN_VALUE, ans_cnt = 0;
        while (tmp != -2000){
            System.out.print("Geef in geheel getal (-2000 pm te stoppen): ");
            tmp = sc.nextInt();
            if (tmp < pre_tmp && tmp != -2000)
                ans_cnt++;
            pre_tmp = tmp;
        }
        System.out.println("Het aantal getallen dat direct gevolgd wordt door een kleiner getal is " + ans_cnt);
    }

}
