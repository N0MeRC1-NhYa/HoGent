package cui;

import java.io.*;
import java.util.Scanner;

public class Oefening_212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een postcode(4 cijfers): ");
        String postcode = sc.nextLine();
        if (postcode.length() != 4) {
            System.out.println("Postcode is niet geldig");
            return;
        }
        try(Scanner fsc = new Scanner (new File("src/additional_files/postcodes.csv"))){
            while(fsc.hasNext()){
                String line =  fsc.nextLine();
                String[] data = line.split(",");
                if (data[0].equals(postcode)){
                    System.out.printf("Postnummer %s komt overeen met de stad %s", data[0], data[1]);
                    return;
                }
            }
            System.out.printf("Postnummer %s staat niet op de lijst",  postcode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
