
import java.util.Scanner;

public class SafeSquareRoot{
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n;
		boolean check = false;
		System.out.println("SQUARE ROOT!");
		System.out.print("Enter a number: ");
		do {
			n = Integer.parseInt(input.nextLine());
			check = false;
			if (n < 0) {
				check = true;
				System.out.println("You can't take the square root of a negative number, silly.");
				System.out.print("Try again: ");
			}

		} while (check);
		System.out.println("The square root of " + n + " is: " + Math.sqrt(n));
	}
}