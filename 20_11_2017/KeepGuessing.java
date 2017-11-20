import java.util.Random;
import java.util.Scanner;

public class KeepGuessing{
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int numRight = 1 + rd.nextInt(10);
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		numGuess = input.nextInt();
		while (numGuess != numRight) {
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			numGuess = input.nextInt();
		}
		System.out.println("That's right! You're a good guesser.");
	}
}