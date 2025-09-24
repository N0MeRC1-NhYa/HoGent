package cui;

import java.util.Scanner;

public class Oefening_24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Geef en gehele leeftijd: ");
        int age = sc.nextInt();
        System.out.println("Age " + (age < 65 ? "is less than" : "greater than or equal to") + " 65");
    }
}
