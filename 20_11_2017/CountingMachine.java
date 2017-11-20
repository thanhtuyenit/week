import java.util.Scanner;

public class CountingMachine{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		System.out.print("Count to:");
		int n = keyboard.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.print(i + " ");
		}

	}
}