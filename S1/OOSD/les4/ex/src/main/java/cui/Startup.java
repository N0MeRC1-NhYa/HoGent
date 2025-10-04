package cui;

import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {
        new Startup().berekenGemiddeldeVanGetallenInTweedimensionaleArray();
    }

    private void berekenGemiddeldeVanGetallenInTweedimensionaleArray(){
        double[][] getallenMatrix = new double[3][2];
        double sum = 0;
        int el_cnt = 0;
        for (int i = 0; i < getallenMatrix.length; i++){
            for (int j = 0; j < getallenMatrix[i].length; j++){
                getallenMatrix[i][j] = geefElement(i + 1, j + 1);
                sum += getallenMatrix[i][j];
                el_cnt++;
            }
        }
        System.out.printf("Het gemiddelde van alle getallen in de matrix is %.1f",sum / el_cnt);
    }

    private double geefElement(int rij, int kolom){
        Scanner invoer = new Scanner(System.in);
        System.out.printf("Geef getal op rij %d en kolom %d: ", rij, kolom);
        return invoer.nextDouble();
    }
}
