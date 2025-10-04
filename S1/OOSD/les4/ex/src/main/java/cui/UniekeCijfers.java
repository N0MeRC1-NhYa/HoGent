package cui;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniekeCijfers {
    public static void main(String[] args) {
        new UniekeCijfers().run();
    }

    private void run(){
        Scanner sc = new Scanner(System.in);
        Set<Character> cijfers= new HashSet<>();

        System.out.print("Geef een getal van 8 betekenisvolle cijfers in > ");
        int input = sc.nextInt();
        while (input / 10_000_000 > 9 || input / 10_000_000 < 1){
            System.out.println("Het getal moet 8 betekenisvolle cijfers bevatten...");
            System.out.print("Geef een getal van 8 betekenisvolle cijfers in > ");
            input = sc.nextInt();
        }

        for (char c : ("" + input).toCharArray()){
            cijfers.add(c);
        }

        System.out.printf("In volgorde van voorkomen zijn unieke cijfers in %d%n", input);
        for (char c : cijfers){
            System.out.printf("%c ", c);
        }
    }
}
