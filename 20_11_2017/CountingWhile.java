import java.util.Scanner;

public class CountingWhile {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Type in a message, and I'll display it five times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		int n = 10;
		System.out.print("Bao nhiêu lần: ");
		int count = keyboard.nextInt();
		while (n <= count * 10) {
			System.out.println((n) + ". " + message);
			n += 10;
		}

	}
}