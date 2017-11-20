import java.util.Scanner;

public class LittleQuiz{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String check;
		int score = 0;
		int checkQ1 = 3, checkQ2 = 2, checkQ3 = 2;
		int ans1, ans2, ans3;
		System.out.print("Are you ready for a quiz?(Y/N) ");
		check = keyboard.nextLine();
		if (check.charAt(0) == 'Y') {
			// play
			System.out.println("Okay, here it comes!");
			System.out.println("Q1) What is the capital of Alaska?\r\n" + "	1) Melbourne\r\n" + "	2) Anchorage\r\n"
					+ "	3) Juneau");
			System.out.print(">");
			ans1 = Integer.parseInt(keyboard.nextLine());
			if (ans1 == checkQ1) {
				System.out.println("That's right!");
				score++;
			} else {
				System.out.println("No, the capital of Alaska is Juneau");
			}
			System.out.println(
					"Q2) Can you store the value \"cat\" in a variable of type int?\r\n" + "	1) yes\r\n" + "	2) no");
			System.out.print(">");
			ans2 = Integer.parseInt(keyboard.nextLine());
			if (ans2 == checkQ2) {
				System.out.println("That's right!");
				score++;
			} else {
				System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			}
			System.out.println("Q3) What is the result of 9+6/3?\r\n" + "	1) 5\r\n" + "	2) 11\r\n" + "	3) 15/3");
			System.out.print(">");
			ans3 = Integer.parseInt(keyboard.nextLine());
			if (ans3 == checkQ3) {
				System.out.println("That's correct!");
				score++;
			} else {
				System.out.println("Sorry, result = 11");
			}

			System.out.println("Overall, you got " + score + " out of 3 correct.\r\n" + "Thanks for playing!");

		} else {
			System.out.println("Goodbye!");
		}
	}
}
