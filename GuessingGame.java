import java.util.Random;
import java.util.Scanner;
/**
 * This program is used to create a game that asks the user to input a number between 1-100 and the computer tells the user if they are correct. If not, the user keeps entering numbers until the computer tells them they got it correct and how many tries it took the user. 
 * @author Deepali Juneja
 * @version 20 February 2020
 */
public class GuessingGame{
    public static void main(String[] args) {

        int secret, guess,count=0;

        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        //User needs to click on Y or y to be able to exit this loop
        while (true) {
            //this will help generate the random number
            secret = rand.nextInt(101);
            //using the while loop to create a loop where user needs to keep guessing till he reached the correct answer.
            while (true) {
                //the user entry being taken here
                System.out.print("Guess the number (Between 1-100):");
                guess = sc.nextInt();
                if (guess == secret) {
                    System.out.println("Effort was worthwhile, after these "+count+" guesses, you got it right!");
                    break;
                } else {
                    if (guess > secret) {
                        System.out.println("Too high! Guess again");
                        count++;
                        continue;
                    } else {
                        System.out.println("Too low! Guess again");
                        count++;
                        continue;
                    }
                }
            }

            System.out.print("\nWish to play again?(Yes/No):");// asking user for Yes or no  character
            char CHAR = sc.next(".").charAt(0);
            if (CHAR == 'Y' || CHAR == 'y')
                continue;
            else {
                System.out.println("Well played!!");
                break;
            }
        }
   
}
}

