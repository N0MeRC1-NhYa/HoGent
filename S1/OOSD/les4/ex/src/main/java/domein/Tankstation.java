package domein;

public class Tankstation {
	private int[] pompen;

	public Tankstation() {
		pompen = new int[]{100, 100, 100, 100, 100};
	}

	public boolean tank(int pompNummer, int aantalLiter) {
		if (aantalLiter >= 5 && aantalLiter <= 80 && geefInhoud(pompNummer) >= aantalLiter){
            this.pompen[pompNummer - 1] -= aantalLiter;
            return true;
        }
        return false;
	}

	public int geefInhoud(int pompNummer) {
		if (pompNummer > 0 && pompNummer < 6)
            return this.pompen[pompNummer - 1];
        return -1;
	}

	public String toString() {
		String resultaat = "";
		for (int i = 0; i < pompen.length; i++) {
			resultaat += String.format("Pomp #%d: %d liter%n", i + 1, pompen[i]);
		}
		return resultaat;
	}

}