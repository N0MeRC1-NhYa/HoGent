package cui;

import java.util.Scanner;
import java.util.Stack;

public class Gezinsuitgaven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] months = new double[12];
        double sum = 0;

        for (int i = 0; i < 12; i++){
            System.out.printf("Geef de uitgaven in voor maand %d:", i + 1);
            months[i] = sc.nextDouble();
            sum += months[i];
        }
        Stack<Integer> ans = new Stack<>();

        double median = sum / 12;
        for (int i = 0; i < 12; i++){
            if (median < months[i])
                ans.push(i+1);
        }
        if (ans.empty())
            System.out.println("Geen maanden gevonden waarin meer werd uitgegven dan het gemiddelde!");
        else {
            System.out.print("Id de volgende maanden werd er meer uitgegeven dan het gemiddelde: ");
            for (int an : ans) {
                System.out.print(an + " ");
            }
        }
    }
}
