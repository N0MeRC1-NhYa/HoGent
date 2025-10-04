package cui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stoelendans {
    private List<String> kinderen = new ArrayList<>();

    public Stoelendans(){
        for (String el : Arrays.asList("Mo", "To", "Bo", "Jo", "Co")){
            this.kinderen.add(el);
        }
    }

    public static void main(String[] args) {
        new Stoelendans().run();
    }

    private void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("We starten de stoelendans met " + this.kinderen);
        while (this.kinderen.size() > 1){
            System.out.println("\nRonde " + (5 - this.kinderen.size() + 1) + " met " + this.kinderen);
            System.out.print("Geef de naam van de afvaller op: ");
            String name = sc.nextLine();
            if (!this.kinderen.contains(name))
                System.out.println("Let op! " + name + " neemt niet deel aan de stoelendans...");
            else
                this.kinderen.remove(name);
        }
        System.out.println("\nProficiat " + this.kinderen.getFirst() + "! Je hebt de stoelendans gewonnen!");
    }

}
