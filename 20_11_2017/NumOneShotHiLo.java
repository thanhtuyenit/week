import java.util.Random;
import java.util.Scanner;

public class NumOneShotHiLo{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int numRight = 1 + rd.nextInt(100);
		System.out.print("I'm thinking of a number between 1-100.  Try to guess it.\n>");
		numGuess = Integer.parseInt(input.nextLine());
		if (numRight == numGuess) {
			// right
			System.out.println("You guessed it!  What are the odds?!?");
		} else {
			// not right
			if(numGuess > numRight)
				System.out.println("Sorry, you are too high.  I was thinking of " + numRight);
			else System.out.println("Sorry, you are too low.  I was thinking of " + numRight);

		}
	}
}