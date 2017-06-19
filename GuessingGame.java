/** 
 * Program: Guessing Game
 * File: GuessingGame.java
 * Summary: Generate random number between 1 and 10000 inclusive. User inputs
 * guess. If guess is lower the random number it will print out "HIGHER", if 
 * guess is higher the random number it will print out "LOWER", if guess is
 * correct then it will print out "You WIN. It took you number of guesses."
 * Author: Samuel Soriano
 * Date: June 16, 2017
 */

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
        // Generate random number and create counter
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10000) + 1;
        int numberOfTries = 0;
        
         //Create while loop
        boolean win = false;
        while (win == false){
       
        
        // Create new Scanner
        Scanner input = new Scanner(System.in);
        int guess; 
        
        // Prompt user to enter a number between 1 and 10000 and create counter
        System.out.print("Guess a number between 1 and 10000: ");
        guess = input.nextInt();
        
        // I was not able to figure out the new range.
        
        // Verifing guess and start the counter
        if (guess == numberToGuess){
            win = true;
        }
        else if (guess < numberToGuess){
            System.out.println("HIGHER");
            numberOfTries++;
        }
        else if (guess > numberToGuess){
            System.out.println("LOWER");
            numberOfTries++;
        }
    }    
        // Display results
        System.out.println("You WIN. It took you " + numberOfTries + " tries ");
    }
}
