package cui;

import domein.Rekenmachine;

import java.util.Scanner;

public class RekenmachineApplication {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new RekenmachineApplication().start();
    }

    private void start(){
        Rekenmachine rm = new Rekenmachine();
        int input;
        do{
            displayMenu();
            input = geefKeuze();
            if (input > 0 && input < 5) {
                double[] getalen = geefGetalen();
                switch(input) {
                case 1 -> rm.telOp(getalen[0], getalen[1]);
                case 2 -> rm.trekAf(getalen[0], getalen[1]);
                case 3 -> rm.vermenigvuldig(getalen[0], getalen[1]);
                case 4 -> rm.deel(getalen[0], getalen[1]);
                }
                displayRes(getalen[0], getalen[1], rm.getResultaat(), input);
            }
        } while (input != 5);
    }

    private void displayMenu(){
        System.out.println("Welke actie wil je uitvoeren?\n" +
                "1. Som\n" +
                "2. Verschil\n" +
                "3. Vermenigvuldiging\n" +
                "4. Deling\n" +
                "5. Stoppen");
    }

    private void displayRes(double a, double b, double res, int sign){
        System.out.printf("%.2f", a);
        System.out.print(" " + new String[]{"+", "-", "*", "/"}[sign - 1] + " ");
        System.out.printf("%.2f = %.2f\n", b, res);
    }

    private int geefKeuze(){
        System.out.print("Geef je keuze in: ");
        return this.sc.nextInt();
    }

    private double[] geefGetalen(){
        double[] res = new double[2];
        System.out.print("Geef het eerste getal: ");
        res[0] = this.sc.nextDouble();
        System.out.print("Geef een tweede getal: ");
        res[1] = this.sc.nextDouble();
        return res;
    }
}
