import java.util.Random;
import java.util.Scanner;
public class AgainWithTheNumberGuessing {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int count = 0;
		int numRight;
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		do {
			numRight = 1 + rd.nextInt(10);
			System.out.print("Your guess: ");
			numGuess = input.nextInt();
			count++;
			if(numGuess != numRight)
				System.out.println("That is incorrect. Guess again.");

		} while (numGuess != numRight);
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + count + " tries.");
	}
}