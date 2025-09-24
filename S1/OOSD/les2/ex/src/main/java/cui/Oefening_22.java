package cui;

import java.util.Scanner;

public class Oefening_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Geef en aantal studenten hoeveelheid:");
        int aantal = sc.nextInt();
        System.out.println(aantal == 1 ? "Student" : "Studenten");
    }
}
