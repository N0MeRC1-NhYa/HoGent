package cui;

import domein.Marktkraam;

import java.util.Scanner;

public class RommelmarktApp {

    private final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new RommelmarktApp().simuleerRommelmarkt();
    }

    private void simuleerRommelmarkt(){
        Marktkraam[] markt = new Marktkraam[geefAantalKramen()];
        for (int i = 0; i < markt.length; i++){
            markt[i] = new Marktkraam(geefKraamhouder(i), geefBreedteKraam(i));
        }
        StringBuilder menu = new StringBuilder();
        for (int i = 0; i < markt.length; i++){
            menu.append(i+1).append(". Kraam van ").append(markt[i].getKraamhouder()).append(".\n");
        }
        int keuze = geefKeuze(markt.length, menu.toString());
        while (keuze != 0){
            markt[keuze - 1].ontvang(geefBedrag());
            keuze =  geefKeuze(markt.length, menu.toString());
        }
        for (Marktkraam m : markt){
            double winst = m.geefWinst();
            System.out.printf("Kraamhouder %s maakte %.2f Euro %s%n", m.getKraamhouder(), Math.abs(winst), winst > 0 ? "winst" : "verlies");
        }
    }

    private double geefBedrag(){
        double bedrag;
        do{
            System.out.print("Geef op voor hoeveel Euro je kocht: ");
            bedrag = this.sc.nextDouble();
            if (bedrag < 0)
                System.out.println("De prijs moet strikt positief zijn...");
        } while (bedrag < 0);
        return bedrag;
    }

    private int geefKeuze(int aantalKramer, String menu){
        int keuze;
        do{
            System.out.println("Aan welk kraam wil je iets kopen?");
            System.out.println(menu);
            System.out.print("Kies je kraam (of geef 0 om te stoppen): ");
            keuze = this.sc.nextInt();
            if (keuze < 0 || keuze > aantalKramer)
                System.out.println("Dit is geen geldige keuze! Probeer opnieuw...\n");
        } while (keuze < 0 || keuze > aantalKramer);
        return keuze;
    }

    private int geefAantalKramen(){
        int kramen;
        do{
            System.out.print("Geef het aantal kramen dat op de rommelmarkt staat op: ");
            kramen = this.sc.nextInt();
            if (kramen <= 0)
                System.out.println("Het aantal moet groter dan 0 zijn, probeer opnieuw...");
        } while (kramen <= 0);
        return kramen;
    }

    private String geefKraamhouder(int kraamnummer){
        String kraamhouder;
        do{
            System.out.print("Geef de naam van de kraamhouder voor kraam " + (kraamnummer + 1) + " op: ");
            kraamhouder = this.sc.next();
            if (kraamhouder == null || kraamhouder.trim().isEmpty())
                System.out.println("De naam van de kraamhouder moet je opgeven...");
        } while (kraamhouder == null || kraamhouder.trim().isEmpty());
        return kraamhouder;
    }

    private int geefBreedteKraam(int kraamnummer){
        int breedte;
        do{
            System.out.print("Geef de breedte van kraam " + (kraamnummer + 1) + " op: ");
            breedte = this.sc.nextInt();
            if (breedte < 2 || breedte > 10)
                System.out.println("De breedte moet tussen 2 en 10 meter liggen...");
        } while (breedte < 2 || breedte > 10);
        return breedte;
    }
}
