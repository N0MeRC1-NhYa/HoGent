package domein;

public class Parking {

	private String[] nummerplaten = new String[5];

	public int parkeer(String nummerplaat) {
		if (nummerplaat != null && nummerplaat.length() <= 9 && nummerplaat.length() >= 3 && !nummerplaat.contains(" ")){
            for (int i = 0; i < this.nummerplaten.length; i++){
                if (this.nummerplaten[i] == null){
                    this.nummerplaten[i] = nummerplaat;
                    return i;
                }
            }
        }
		return -1;
	}

	public boolean verlaat(String nummerplaat) {
		for (int i = 0; i < this.nummerplaten.length; i++){
            if (this.nummerplaten[i] != null && this.nummerplaten[i].equals(nummerplaat)){
                this.nummerplaten[i] = null;
                return true;
            }
        }
		return false;
	}

	public int geefAantalVrijePlaatsen() {
		int aantalVrij = 0;
		for (String np : nummerplaten) {
			aantalVrij += np == null ? 1 : 0;
		}
		return aantalVrij;
	}

	public String toString() {
		String plaatsen = "";
		for (int i = 0; i < nummerplaten.length; i++) {
			plaatsen += String.format("%12d", i);
		}
		plaatsen += "\n";
		for (String np : nummerplaten) {
			plaatsen += String.format("%12s", np == null ? "--vrij--" : np);
		}
		return plaatsen;
	}
}
