package cui;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Startup_2 {

    public static void main(String[] args) {
        new Startup_2().maakLijstMetTevredenheidsscoresEnToonSamenvatting();
    }

    private void maakLijstMetTevredenheidsscoresEnToonSamenvatting() {
        // Maak en vul de lijst scores
        SecureRandom sr = new SecureRandom();
        int aantalScores = sr.nextInt(10, 1001);
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < aantalScores; i++) {
            scores.add(sr.nextInt(1, 6));
        }

        int[] sc = new int[5];
        for (int i = 0; i < scores.size(); i++)
            sc[scores.get(i) - 1]++;
        System.out.println("Samenvatting van " + scores.size() + " scores:");
        System.out.println("\tscore\taantal");
        for (int i = 0; i < 5; i++)
            System.out.printf("\t%5d\t%6d%n", i + 1, sc[i]);

    }

}
