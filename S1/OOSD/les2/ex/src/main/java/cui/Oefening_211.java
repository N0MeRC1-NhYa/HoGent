package cui;

import java.util.Scanner;

public class Oefening_211 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Geef een gehele getal in: ");
        int x = sc.nextInt();
        if (x > 0){
            x -= 10;
            System.out.println("Het ingegeven getal was strikt positief en werd verminderd met 10. " +
                    "Het heeft nu de waarde " + x + ".");
        } else if (x < 0){
            x += 10;
            System.out.println("Het ingegeven getal was negatief en werd vermeerderd met 10. " +
                    "Het heeft nu de waarde " + x + ".");
        } else
            System.out.println("Het ingegeven getal was nul en werd vermeerderd met 1. " +
                    "Het heeft nu de waarde " + ++x + ".");
    }
}
