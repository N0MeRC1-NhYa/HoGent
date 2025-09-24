package cui;

public class Oefening_28 {
    public static void main(String[] args) {
        Oefening_28 o=new Oefening_28();
        o.oef_1();
        o.oef_2();
        o.oef_3();
    }

    private void oef_1()
    {
        int n = 12;
        int max = 500;
        for (int i = n; i < max; i++){
            if (i % n == 0 && i + n < max){
                System.out.print(i + ", ");
            }
            else if (i % n == 0){
                System.out.print(i + ".");
            }
        }
        System.out.println();
    }

    private void oef_2()
    {
        int n = 51;
        for (int i = n; i > 0; i--){
            if (i % 2 == 1)
                System.out.printf("%2d ", i);
            if (i % 10 == (n + 2) % 10)
                System.out.println();
        }
        System.out.println();
    }

    private void oef_3(){
        for (int i = 'A'; i <= 'Z'; i++)
            System.out.printf("%c", i);
    }
}
