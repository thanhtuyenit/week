import java.util.Scanner;

public class CountingFor {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.println("Type in a message, and I'll display it five times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		for (int n = 2; n <= 10; n = n + 2) {
			System.out.println(n + ". " + message);
		}

	}
}