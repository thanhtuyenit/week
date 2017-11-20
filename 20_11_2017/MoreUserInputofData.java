import java.util.Scanner;

public class MoreUserInputofData{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String firstName, lastName, studentIdNumber;
		String loginName;
		int grade;
		float GPA;
		System.out.println("Please enter the following information so I can sell it for a profit!\n");
		System.out.print("First name: ");
		firstName = keyboard.nextLine();
		System.out.print("Last name: ");
		lastName = keyboard.nextLine();
		System.out.print("Grade (9-12): ");
		grade = Integer.parseInt(keyboard.nextLine());
		System.out.print("Student ID: ");
		studentIdNumber = keyboard.nextLine();
		System.out.print("Login: ");
		loginName = keyboard.nextLine();
		System.out.print("GPA (0.0-4.0): ");
		GPA = keyboard.nextFloat();

		System.out.println();

		System.out.println("Your information:\n");
		System.out.println("Login: " + loginName);
		System.out.println("ID: " + studentIdNumber);
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("GPA: " + GPA);
		System.out.println("Grade: " + grade);

	}
}
