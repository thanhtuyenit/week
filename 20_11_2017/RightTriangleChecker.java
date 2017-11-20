import java.util.Scanner;

public class RightTriangleChecker {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num1, num2, num3;
		boolean check = false;
		System.out.println("Enter three integers");
		System.out.print("Sile 1: ");
		num1 = Integer.parseInt(input.nextLine());
		do {
			System.out.print("Sile 2: ");
			num2 = Integer.parseInt(input.nextLine());
			check = false;
			if (num2 < num1) {
				System.out.println(num2 + " is smaller than " + num1 + ". Try again.");
				check = true;
			}
		} while (check);

		do {
			System.out.print("Sile 3: ");
			num3 = Integer.parseInt(input.nextLine());
			check = false;
			if (num3 < num2) {
				System.out.println(num3 + " is smaller than " + num2 + ". Try again.");
				check = true;
			}
		} while (check);
		System.out.println("Your three sides are " + num1 + " " + num2 + " " + num3);
		if ((num1 * num1 + num2 * num2) != num3 * num3) {
			System.out.println("NO!  These sides do not make a right triangle!");
		} else {
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
		}
	}
}