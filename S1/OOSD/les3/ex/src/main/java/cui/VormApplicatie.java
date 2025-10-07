package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.*;

public class VormApplicatie {

    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new VormApplicatie().run();
    }

    private void run() {
        System.out.println("Rechthoeken en driehoeken");
        System.out.println("-------------------------");
        System.out.print("Wil je graag nog een vorm ingeven (1=een rechthoek, 2=een driehoek, 0=nee)? ");
        int input = this.in.nextInt();
        int vormCnt = 0, rechthoekCnt = 0, rechthoekigeCnt = 0;
        while (input != 0) {
            vormCnt++;
            switch (input) {
                case 1:
                    rechthoekCnt += geefRechthoek() ? 1 : 0;
                    break;
                case 2:
                    rechthoekigeCnt += geefDreihoek() ? 1 : 0;
                    break;
                default:
                    System.out.println("Geen optie " + input);

            }

            System.out.print("Wil je graag nog een vorm ingeven (1=een rechthoek, 2=een driehoek, 0=nee)? ");
            input = this.in.nextInt();
        }
        System.out.println("Overzicht vormen:");
        System.out.println("Totaal aantal vormen: " + vormCnt);
        System.out.println("Aantal rechthoeken met opp > 50: " + rechthoekCnt);
        System.out.println("Aantal rechthoekige driehoeken: " + rechthoekigeCnt);
    }

    private boolean geefDreihoek() {
        List<Integer> a = new ArrayList<>();
        for (char c : "ABC".toCharArray()) {
            System.out.printf("Geef de lengte van zijde %c: ", c);
            a.add(this.in.nextInt());
        }
        return new Driehoek(a.removeFirst(), a.removeFirst(), a.removeFirst()).isRechthoekig();
    }

    private boolean geefRechthoek() {
        double lengte, breedte;
        System.out.print("Geef de lengte van de rechthoek: ");
        lengte = this.in.nextDouble();
        System.out.print("Geef de breedte van de rechthoek: ");
        breedte = this.in.nextDouble();
        return new Rechthoek(lengte, breedte).berekenOppervlakte() > 50;
    }
}
