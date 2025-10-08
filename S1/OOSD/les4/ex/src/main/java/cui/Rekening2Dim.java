package cui;

import domein.Rekening;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rekening2Dim {

    public static void main(String[] args) {
        new Rekening2Dim().run();
    }

    private void run(){
        Rekening[][] r2d = new Rekening[3][];
        Scanner sc = new Scanner(System.in);
        int input;
        for (int i = 0; i < r2d.length; i++){
            System.out.print("Geef aantal kolommen in voor rij " + (i + 1) + ": ");
            input = sc.nextInt();
            if (input > 0) {
                r2d[i] = new Rekening[input];
                for (int j = 0; j < input; j++){
                    r2d[i][j] = new Rekening((i + 1) * 10 + j + 1, Integer.toString((i + 1) * 10 + j + 1 ));
                }
            } else {
                System.out.println("Rij " + (i + 1) + " moet minstens 1 kolom hebben!");
                i--;
            }
        }

        for (int i = 0; i < r2d.length; i++){
            for (int j = 0; j < r2d[i].length; j++){
                System.out.print(r2d[i][j].getRekeningNummer() + "\t");
            }
            System.out.println();
        }
    }
}
