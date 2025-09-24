package werkcollege2;

public class Mystery1 {
    public static void main(String[] args) {
        Mystery1 m = new Mystery1();
        m.callMysteryMethod1();
        m.callMysteryMethod2();
    }

    // displays all squares for numbers 1->10 and stores there sum in total
    private void callMysteryMethod1(){
        int y, x = 1, total = 0;
        for (; x <= 10; x = x + 1)
        {
            y = x * x;
            System.out.printf("%d%n", y);
            total = total + y;
        }
        System.out.printf("Total is %d%n", total);
    }

    // displays **** if count is odd and ++++++++ is it's even.
    private void callMysteryMethod2(){
        for (int count = 1; count <= 10; count = count + 1){
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
        }
    }
}
