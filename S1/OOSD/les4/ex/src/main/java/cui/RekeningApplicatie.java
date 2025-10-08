package cui;
import domein.Rekening;

public class RekeningApplicatie {
    public static void main(String[] args) {
        new RekeningApplicatie().start();
    }

    private void start(){
        double[] saldos = new double[]{100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413.26};
        Rekening[] rekenings = new Rekening[saldos.length];

        for (int i = 0; i < saldos.length; i++){
            rekenings[i] = new Rekening(i, String.valueOf((char)(i+'A')));
            rekenings[i].stort(saldos[i]);
        }
        double sum = 0;

        for (Rekening r : rekenings){
            sum += r.getSaldo();
            System.out.printf("Rekening %d van %s bevat %.2f Euro\n", r.getRekeningNummer(), r.getNaamHouder(), r.getSaldo());
        }

        System.out.printf("\nHet gemiddelde saldo van deze %d rekeningen bedraagt %.2f Euro", saldos.length, sum / saldos.length);
    }
}
