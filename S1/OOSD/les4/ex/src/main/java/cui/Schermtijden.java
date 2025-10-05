package cui;

public class Schermtijden {

    int[] tijden = { 800, 750, 700, 720, 700, 680, 650, 620, 630, 620 };
//    int[] tijden = { 570, 575, 573, 560, 600, 610, 590, 580, 570, 560 };
//    int[] tijden = { 800, 750, 700, 680, 700, 680, 650, 700, 630, 620 };
//    int[] tijden = { 900, 850, 800, 790, 789, 780, 750, 740, 730, 630 };
//    int[] tijden = { 850, 851, 860, 866, 902, 910, 920, 930, 931, 940 };

    public static void main(String[] args) {
        new Schermtijden().run();
    }

    private void run(){

        int start_index = 0;
        int days_cnt = 0;

        int tmp_index = 0;
        int tmp_days_cnt = 0;

        for (int i = 0; i < this.tijden.length - 1; i++){
            if (this.tijden[i] > this.tijden[i + 1]){
                tmp_days_cnt++;
            }
            else{
                if (days_cnt < tmp_days_cnt){
                    days_cnt = tmp_days_cnt;
                    start_index = tmp_index;
                }
                tmp_days_cnt = 0;
                tmp_index = i + 1;
            }
        }
        if (days_cnt < tmp_days_cnt){
            days_cnt = tmp_days_cnt;
            start_index = tmp_index;
        }
        if (days_cnt == this.tijden.length - 1){
            System.out.println("Proficiat! Challenge completed! Elke dag ging je schermtijd omlaag.");
            System.out.printf("Uiteindelijk is je schermtijd met %d minuten gedaald!", this.tijden[0] - this.tijden[this.tijden.length - 1]);
        }
        else if (days_cnt == 0){
            System.out.println("Wat een ontgoocheling, je schermtijd ging enkel omhoog ipv omlaag!");
        } else {
            System.out.printf("De langste reeks van opeenvolgende dagen dat je schermtijd daalde overspande %d dagen.%n", days_cnt);
            System.out.printf("Deze daling zette zich in van dag %d op dag %d.%n", start_index + 1, start_index + 2);
            System.out.printf("In deze periode daalde je schermtijd met %d minuten.", this.tijden[start_index] - this.tijden[start_index + days_cnt]);
        }
    }
}
