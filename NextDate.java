/*
 * Implement a program to generate and display the next date of a given date.

The date will be provided as day, month and year as shown in the below table.
day - 1
month - 3
year - 15

The output should be displayed in the format: day-month-year.
Assumption: The input will always be a valid date.
 */

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input day, month, year
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year (2-digit or 4-digit): ");
        int year = sc.nextInt();

        // If year is two digits, assume 2000+
        if (year < 100) {
            year += 2000;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        day++;

        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println(day + "-" + month + "-" + year);

        sc.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
