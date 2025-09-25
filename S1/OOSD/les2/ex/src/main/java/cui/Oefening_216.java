package cui;

public class Oefening_216 {
    public static void main(String[] args) {
        Oefening_216 o = new Oefening_216();
        o.oefA();
        o.oefB();
        o.oefC();
        o.oefD();
    }

    private void oefA(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    private void oefB(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    private void oefC(){
        for (int i = 0; i < 10; i++){
            for (int j = i; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void oefD(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (10 - 1 - i > j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
