import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int numRight = 1 + rd.nextInt(10);
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		numGuess = Integer.parseInt(input.nextLine());
		if (numRight == numGuess) {
			// right
			System.out.println("That's right!  My secret number was " + numRight);
		} else {
			// not right
			System.out.println("Sorry, but I was really thinking of " + numRight);

		}
	}
}