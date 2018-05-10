/**
 * Created by MDavidovich on 7/5/16.
 */

import java.util.Scanner;

public class Davidovich_A02Q4 {

    /*
    This program asks user for a year to determine if that year is
    a leap year.  Any year before 1582 will result in error as the program
    only checks for years in the Gregorian calendar which started in 1582.
     */

    public static void main(String[] args){

        int year;                       // Initalizes variables.
        final int greg_start = 1582;

        Scanner scan = new Scanner(System.in);

        System.out.print("What year should be checked? ");  // Gathers user input.
        year = scan.nextInt();

        while (year < greg_start){      // Checks that year is after 1581.
            System.out.println("Please enter a year after 1581.");
            System.out.print("What year should be checked? ");
            year = scan.nextInt();}

        if ((year % 4) == 0)            // Conditional statements if year
            if ((year % 100 == 0))      // is after 1582.
                if ((year % 400 == 0))
                    System.out.print(year + " is a leap year.");
                else
                    System.out.print(year + " is not a leap year.");
            else
                System.out.print(year + " is a leap year.");
        else
            System.out.print(year + " is not a leap year.");
    }
}
