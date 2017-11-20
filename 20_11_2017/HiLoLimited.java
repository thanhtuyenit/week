import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int count = 6;
		int numRight = 1 + rd.nextInt(100);
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.print("Your guess: ");
		numGuess = Integer.parseInt(input.nextLine());
		int i = 2;
		while (count != 0) {
		//	numRight = 1 + rd.nextInt(100);
			if (numRight == numGuess) {
				// right
				System.out.println("You guessed it! What are the odds?!?");
				count = 0;
			} else {
				count--;
				// not right
				if (numGuess > numRight) {
					System.out.println("Sorry, you are too high.");
					System.out.print("Your guess " + i++ + ": ");
					numGuess = Integer.parseInt(input.nextLine());

				} else {
					System.out.println("Sorry, you are too low.");
					System.out.print("Your guess " + i++ + ": ");
					numGuess = Integer.parseInt(input.nextLine());

				}

			}
		}
		if (numGuess != numRight) {
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		}

	}
}