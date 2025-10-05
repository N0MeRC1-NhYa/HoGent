package cui;

import java.security.SecureRandom;

public class MatrixApp {

	public static void main(String[] args) {
		new MatrixApp().maakEnTransponeerMatrix();
	}

	private void maakEnTransponeerMatrix() {
		// Maak matrix
		SecureRandom sr = new SecureRandom();
		int[][] matrix = new int[sr.nextInt(1, 5)][sr.nextInt(1, 5)];
		for (int rij = 0; rij < matrix.length; rij++) {
			for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
				matrix[rij][kolom] = sr.nextInt(101);
			}
		}

		// Toon matrix
		System.out.println("Matrix:");
		toonMatrix(matrix);

		// TODO - Hier aanvullen!
		int[][] getransponeerdeMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                getransponeerdeMatrix[j][i] = matrix[i][j];
            }
        }

		// Toon getransponeerdeMatrix
		System.out.printf("%nGetransponeerde matrix:%n");
		toonMatrix(getransponeerdeMatrix);
	}

	private void toonMatrix(int[][] matrix) {
		for (int[] rij : matrix) {
			for (int getal : rij) {
				System.out.printf("%5d", getal);
			}
			System.out.println();
		}
	}

}
