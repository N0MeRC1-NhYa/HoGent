package cui;

import domein.Tankstation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TankstationApp {

	public static void main(String[] args) {
		new TankstationApp().startTanken();
	}

	private void startTanken() {

        Scanner sc = new Scanner(System.in);
        Set<Integer> pomps = new HashSet<>();
        Tankstation ts = new Tankstation();
        int input = geefPompNummer(sc);
        int liter_cnt = 0;

        while (input != 0){
            while (ts.geefInhoud(input) == -1){
                System.out.printf("We hebben geen pomp met nummer %d! Probeer opnieuw...%n", input);
                input = geefPompNummer(sc);
            }
            int liter = geefAantalLiter(sc);
            if (liter > ts.geefInhoud(input))
                System.out.println("Sorry, er is onvoldoende brandstof aan pomp " + input);
            else {
                while (!ts.tank(input, liter)) {
                    System.out.println("Je moet minstens 5 en kan maximaal 80 liter tanken...");
                    liter = geefAantalLiter(sc);
                }
                System.out.printf("Je hebt %d liter getankt aan pomp %d%n", liter, input);
                pomps.add(input);
                liter_cnt += liter;
            }
            System.out.println("\nOverzicht pompen:");
            System.out.println(ts);
            input = geefPompNummer(sc);
        }
        if (liter_cnt == 0){
            System.out.println("Er waren geen tankbeurten:");
            System.out.println(ts);
        }
        System.out.printf("Er werd in totaal %d liter getankt in %d tankbeurt.", liter_cnt, pomps.size());
	}

	private int geefAantalLiter(Scanner sc) {
        System.out.print("Hoeveel liter wens je te tanken (5 of 80)? ");
        return sc.nextInt();
	}

	private int geefPompNummer(Scanner sc) {
        System.out.print("Aan welke pomp wil je tanken (1-5), druk 0 om te stoppen? ");
        return sc.nextInt();
	}
}