package cui;

public class Oefening_215 {
    public static void main(String[] args) {
        Oefening_215 o = new Oefening_215();
        o.oef1();
        o.oef2();
    }

    // 10 lijnen met 5 '@' chars
    private void oef1(){
        for (int i = 1; i <= 10; i++) {
            for( int j = 1; j<=5 ; j++)
                System.out.print('@');
            System.out.println();
        }
    }

    // 5 rechthoeken 3x4 met '*' chars
    private void oef2(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 3; j++){
                for (int k = 1; k <= 4; k++){
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
