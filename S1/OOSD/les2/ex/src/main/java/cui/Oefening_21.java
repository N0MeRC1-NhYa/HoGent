package cui;

import java.util.Scanner;

public class Oefening_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Oefening_21 o = new Oefening_21();
        o.oef_1(sc);
        o.oef_2(sc);
        o.oef_3(sc);
    }

    private void oef_1(Scanner sc){
        System.out.print("Geef en gehele x: ");
        int x = sc.nextInt();
        if  (x<0)
            System.out.println("x is negatief");
        else
            System.out.println("x is positief");
    }

    private void oef_2(Scanner sc){
        System.out.print("Geef en gehele temperature: ");
        int temp = sc.nextInt();
        if  (temp<=10)
            System.out.println("Het is koud");
        else if (temp < 20)
            System.out.println("De weer is goed");
        else{
            System.out.println("Het is warm");
        }
    }

    private void oef_3(Scanner sc){
        System.out.print("Geef en gehele x: ");
        int x =  sc.nextInt();
        if  (x<0)
            System.out.print("x is negatief ");
        else
            System.out.print("x is positief ");
        if (x % 2 == 0)
            System.out.print("en even");
        else
            System.out.print("en oneven");
    }
}
