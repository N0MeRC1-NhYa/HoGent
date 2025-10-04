package cui;

import java.util.Scanner;

public class VierOpRij {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VierOpRij vor = new VierOpRij();
        vor.run(sc);
    }

    private void run(Scanner sc){
        System.out.print("De rij karakters: ");
        String input = sc.nextLine();
        int cnt = 0;
        boolean f_X = false;

        for (int i = 1; i < input.length(); i+=2) {
            if (input.charAt(i) == 'X') {
                if (f_X)
                    cnt++;
                else
                    cnt = 1;
                f_X = true;
            } else {
                if (f_X)
                    cnt = 1;
                else
                    cnt++;
                f_X = true;
            }
            if (cnt == 4) {
                System.out.println("Deze rij bevat vier op een rij...");
                return;
            }
        }
        System.out.println("Deze rij bevat geen vier op een rij...");
    }
}
