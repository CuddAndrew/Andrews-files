import java.util.Scanner;
/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: This program generates a random number then asks the user to guess it until they get it right
 * Due: 9/27/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Andrew Cudd
*/

//This class includes the main method which runs the bulk of the program to get the user to guess the number
public class RandomNumberGuesser {
	public static void main(String[] args) {
		//Declaring variables
		Scanner input = new Scanner(System.in);
		int nextGuess, lowGuess, highGuess, count, randNum;
		char answer;
		//loop to rerun code when user enters yes
		do {
			//Generates random number and resets lowGuess, highGuess, and count
			randNum = RNG.rand();
			lowGuess = 0;
			highGuess = 99;
			count = 1;
			System.out.println("Enter your first guess");
			//Loop to ask for next guess when they are wrong
			do {
				nextGuess = input.nextInt();
				//Guess validation loop
				while (RNG.inputValidation(nextGuess, lowGuess, highGuess) == false) {
					nextGuess = input.nextInt();
				}
				//Shows how many guesses the user has made
				System.out.println("number of guesses is " + count);
				//checks if the user was too low, high, or correct
				if (nextGuess == randNum) {
					continue;
				} else if (nextGuess > randNum) {
					System.out.println("Your guess is too high");
					highGuess = nextGuess;
				} else if (nextGuess < randNum) {
					System.out.println("Your guess is too low");
					lowGuess = nextGuess;
				}
				count++;
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				//checking if they were correct again
			} while (nextGuess != randNum);
			//display they were correct and if they want to try again
			System.out.println("Congratulations, you guessed correctly");
			System.out.println("Try again? (y or n)");
			answer = input.next().charAt(0);
			//loop to validate user input
			while (answer != 'y' && answer != 'n') {
				System.out.println("invalid input type \"y\" or \"n\"");
				answer = input.next().charAt(0);
			}
			//loop to start the process over again if asked
		} while (answer == 'y');
		System.out.println("Thanks for playing…");
	}
}