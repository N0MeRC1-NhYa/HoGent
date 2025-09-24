package werkcollege2;

public class Werkcollege_12 {
    public static void main(String[] args) {
        new Werkcollege_12().berekenIncrementEnDecrement();
    }
    private void berekenIncrementEnDecrement() {
        int a = 0, b = 0, c = 0;
        a = ++b + ++c; //   a = 2       b = 1       c = 1
        System.out.printf("a=%d\t\tb=%d\t\tc=%d\n", a, b, c);
        a = b++ + c++; //   a = 2       b = 2       c = 2
        System.out.printf("a=%d\t\tb=%d\t\tc=%d\n", a, b, c);
        a = ++b + c++; //   a = 5       b = 3       c = 3
        System.out.printf("a=%d\t\tb=%d\t\tc=%d\n", a, b, c);
        a = b-- + c--; //   a = 6       b = 2       c = 2
        System.out.printf("a=%d\t\tb=%d\t\tc=%d\n", a, b, c);
    }
}
