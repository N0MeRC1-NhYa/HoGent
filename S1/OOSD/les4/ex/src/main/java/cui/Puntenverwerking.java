package cui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Puntenverwerking {

    private final Scanner sc;
    private final ArrayList<String> namen;

    public Puntenverwerking(String file_path) throws FileNotFoundException {
        sc = new Scanner(System.in);
        namen = new ArrayList<>();
        try(Scanner fsc = new Scanner (new File(file_path))) {
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                String[] data = line.split(" ");
                Collections.addAll(namen, data);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Puntenverwerking("src/additional_files/klasnamen.txt").run();
    }

    private void run(){
        ArrayList<String> geslaagd = new ArrayList<>();
        ArrayList<String> n_geslaagd = new ArrayList<>();

        for (String naam : this.namen){
            int res;
            do{
                System.out.printf("Geef resultaat van %s (0-20) > ", naam);
                res = this.sc.nextInt();
                if (res < 0 || res > 20)
                    System.out.println("Een geldig resultaat ligt tussen 0 en 20!");
            } while (res < 0 || res > 20);
            if (res >= 10)
                geslaagd.add(naam);
            else
                n_geslaagd.add(naam);
        }

        if (geslaagd.isEmpty())
            System.out.println("Geen enkele student slaagde...");
        else{
            System.out.println("Volgende studenten zijn geslaagd:");
            for (String naam : geslaagd)
                System.out.println(naam);
        }

        if (n_geslaagd.isEmpty())
            System.out.println("Er waren geen niet geslaagden");
        else{
            System.out.println("Volgende studenten zijn niet geslaagd:");
            for (String naam : n_geslaagd)
                System.out.println(naam);
        }
    }
}
