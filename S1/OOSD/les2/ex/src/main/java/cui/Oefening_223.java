package cui;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Oefening_223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int d_cnt = 0;
        Stack<Integer> delers = new Stack<>();
        do {
            System.out.print("Geef een strijkt positief geheel getal in: ");
            a = sc.nextInt();
        } while (a <= 0);
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                d_cnt++;
                delers.push(i);
            }
        }
        System.out.printf("%d heeft %d delers namelijk: %n", a, ++d_cnt);
        for (Integer deler : delers){
            System.out.print(deler + " ");
        }
        System.out.print("en " + a);
    }
}
