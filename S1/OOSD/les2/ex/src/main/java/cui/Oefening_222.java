package cui;

import java.util.Scanner;

public class Oefening_222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int max2 = max;
        int a;
        for (int i = 0; i < 10; i++){
            System.out.print("Geef een gehele getal in: ");
            a = sc.nextInt();
            if (max < a){
                max2 = max;
                max = a;
            }
        }
        System.out.println("Het op een na grotste getal is " + max2);
    }
}
