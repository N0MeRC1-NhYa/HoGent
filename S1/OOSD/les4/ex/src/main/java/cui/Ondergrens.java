package cui;

import java.util.Scanner;

public class Ondergrens {

    int size;
    private final int[] getallen;
    private int ondergrens;

    public Ondergrens(int size){
        this.size = size;
        getallen = new int[size];
    }

    public static void main(String[] args) {

        Ondergrens ond = new Ondergrens(10);
        Scanner sc = new Scanner(System.in);

        ond.set_getallen(sc);
        ond.set_ondergrens(sc);
        ond.get_hoger(ond.ondergrens);
    }

    private void set_getallen(Scanner sc){
        for (int i = 0; i < 10; i++){
            System.out.printf("Geef getal %d op: ", i + 1);
            this.getallen[i] = sc.nextInt();
        }
    }

    private void set_ondergrens(Scanner sc){
        System.out.print("Geef de ondergrens op: ");
        this.ondergrens = sc.nextInt();
    }

    private void get_hoger(int n){
        System.out.println("\nElementen van de array die strikt groter dan " + n + " zijn:");
        System.out.println("\tIndex\tWaarde");
        for (int i = 0; i < this.size; i++){
            if (n < this.getallen[i])
                System.out.printf("\t%5d\t%6d%n", i, this.getallen[i]);
        }
    }
}
