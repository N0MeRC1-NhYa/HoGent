package cui;

import java.util.Scanner;

public class Oefening_213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef de teller in van de breuk: ");
        int a = sc.nextInt();
        System.out.print("Geef de noemer in van de breuk: ");
        int b = sc.nextInt();
        System.out.printf("%d / %d = %d%n", a,b,a / b);
        System.out.printf("%d %% %d = %d%n", a,b,a % b);
        if (a % b == 0){
            System.out.printf("%nvereenvoudigde breuk = %d / 1", a / b);
        }
    }
}
