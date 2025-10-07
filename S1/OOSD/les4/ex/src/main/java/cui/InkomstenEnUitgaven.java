package cui;

import java.util.Scanner;
import java.util.Stack;

public class InkomstenEnUitgaven {
    public static void main(String[] args) {
        new InkomstenEnUitgaven().run();
    }

    private void run(){
        Scanner sc = new Scanner(System.in);
        Stack<Double> pos = new Stack<>();
        Stack<Double> neg = new Stack<>();

        System.out.print("Geef bedrag op (0 om te stoppen) > ");
        double input = sc.nextDouble();
        while (input != 0){
            if (input >= 1)
                pos.add(input);
            if (input <= -1)
                neg.add(input);
            System.out.print("Geef bedrag op (0 om te stoppen) > ");
            input = sc.nextDouble();
        }
        display(pos, "Inkomsten");
        display(neg, "Uitgaven");
    }

    private void display(Stack<Double> stack, String s){
        double sum = 0;
        for (double n : stack)
            sum += n;
        System.out.printf("%n%s (totaal = %.2f Euro):%n", s, Math.abs(sum));
        for (double n : stack)
            System.out.printf("%.2f ",Math.abs(n));
        System.out.println();
    }
}

