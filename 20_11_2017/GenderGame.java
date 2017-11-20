import java.util.Scanner;

public class GenderGame{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String check, gender, firstName, lastName;
		int age;
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.nextLine();
		System.out.print("First name: ");
		firstName = keyboard.nextLine();
		System.out.print("Last name: ");
		lastName = keyboard.nextLine();
		System.out.print("Age: ");
		age = Integer.parseInt(keyboard.nextLine());
		if (gender.equals("F") && (age > 20)) {
			System.out.print("Are you married, " + firstName + "(y or n)? ");
			check = keyboard.nextLine();
			if (check.equals("y"))
				System.out.println("Then I shall call you Mrs." + lastName);
			else
				System.out.println("Then I shall call you Ms. " + lastName);
		} else {
			if ((gender.equals("M")) && (age > 20)) {
				System.out.println("Then I shall call you Mr. " + lastName);
			} else
				System.out.println("Then I shall call you " + firstName + " " + lastName);
		}
	}
}