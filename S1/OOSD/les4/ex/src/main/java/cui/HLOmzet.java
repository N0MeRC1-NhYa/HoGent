package cui;

public class HLOmzet {

    private int[] omzet;

    public HLOmzet(){
        omzet = new int[]{360, 2100, 450, 1450, 650, 780, 1200, 321, 560, 1850, 960, 420};
    }

    public static void main(String[] args) {
        HLOmzet hlo = new HLOmzet();
        hlo.getHoogste();
        hlo.getLaagste();
    }

    private void getHoogste(){
        int pos = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.omzet.length; i++){
            if (max < this.omzet[i]){
                max = this.omzet[i];
                pos = i+1;
            }
        }
        System.out.printf("Hoogste omzet van %d Euro werd behaald in %d%s maand.%n", max, pos, (pos == 1 || pos == 8) ? "ste" : "de");
    }

    private void getLaagste(){
        int pos = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.omzet.length; i++){
            if (min > this.omzet[i]){
                min = this.omzet[i];
                pos = i+1;
            }
        }
        System.out.printf("Laagste omzet van %d Euro werd behaald in %d%s maand.%n", min, pos, (pos == 1 || pos == 8) ? "ste" : "de");
    }
}

