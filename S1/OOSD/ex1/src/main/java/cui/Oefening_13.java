package cui;

import java.util.Scanner;

public class Oefening_13 {

    public static void main(String[] args) {
        int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een datum in <ddmmyyyy>: ");
        String line = sc.nextLine();
        int days_in_year = 365;
        int day = (line.charAt(0) - '0') * 10 + (line.charAt(1) - '0');
        int month = (line.charAt(2) - '0') * 10 + (line.charAt(3) - '0');
        int year = (line.charAt(4) - '0') * 1000 + (line.charAt(5) - '0') * 100 +
                (line.charAt(6) - '0') * 10 + (line.charAt(7) - '0');
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            days_in_year++;
            days_in_month[1]++;
        }
        int days = 0;
        for (int i = 0; i < month - 1; i++)
            days += days_in_month[i];
        days += day;
        System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!%n",  days_in_year - days);
    }


}
