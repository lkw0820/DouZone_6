package kosa.api;

import java.util.*;

public class QSasdasd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Create a calendar instance and set the year and month
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1);

        // Print the calendar header
        System.out.println(" " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " + year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        // Get the number of days in the month
        int numDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Get the day of the week of the first day of the month
        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        // Print the calendar days
        int dayCount = 1;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 8; j++) {
                if (i == 1 && j < startDay) {
                    System.out.print("   ");
                } else if (dayCount > numDays) {
                    break;
                } else {
                    System.out.printf("%3d", dayCount);
                    dayCount++;
                }
            }
            System.out.println();
            if (dayCount > numDays) {
                break;
            }
        }
    }
}
