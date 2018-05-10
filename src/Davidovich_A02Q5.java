import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mike Davidovich on 7/5/16.
 * Last modified 7/5/2016/
 */

public class Davidovich_A02Q5 {

    // This program creates a random number and asks the user to guess the number.
    // The program will tell the user if the number is too high or too low and upon
    // guessing the correct number, the user will be told how many guesses it took.

    public static void main(String[] args){

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int rand_num = rand.nextInt(100) + 1, count = 0;    // Creates random number
        System.out.print("What number do you guess? ");
        int num_guess = scan.nextInt();

        //  Use following to show random number picked by computer.
        //  System.out.println(rand_num);

        while (num_guess != rand_num){                          // While loops executes as long
            if (num_guess > rand_num){                          // as guesses number doesn't equal
                System.out.print("That's too high! ");          // random number.  The loop will
                System.out.print("What number do you guess? "); // execute the correct statement
                num_guess = scan.nextInt();                     // based on if the number it too high
                count++;}                                       // or too low.
            else {
                System.out.print("That's too low! ");
                System.out.print("What number do you guess? ");
                num_guess = scan.nextInt();
                count++;}}

        if (num_guess == rand_num)
            System.out.print("That's correct!  You made " + count + " guesses.");
    }
}
