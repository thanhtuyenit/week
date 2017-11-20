import java.util.Scanner;

public class TwentyQuestions{
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String ans1, ans2;
		System.out.println("TWO QUESTIONS!\r\n" + "Think of an object, and I'll try to guess it.");
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print(">");
		ans1 = input.nextLine();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print(">");
		ans2 = input.nextLine();
		if (ans1.equals("animal") && ans2.equals("no")) {
			System.out.println("My guess is that you are thinking of a mouse.\r\n"
					+ "I would ask you if I'm right, but I don't actually care.");
		} else {
			if (ans1.equals("animal") && ans2.equals("yes")) {
				System.out.println("My guess is that you are thinking of a squirrel.\r\n"
						+ "I would ask you if I'm right, but I don't actually care.");
			} else {
				if (ans1.equals("vegetable") && ans2.equals("no")) {
					System.out.println("You're thinking of a carrot!\\r\\n\" + \r\n"
							+ "\"I would ask you if I'm right, but I don't actually care.");
				} else {
					if (ans1.equals("vegetable") && ans2.equals("yes")) {
						System.out.println("You're thinking of a watermelon!\r\n"
								+ "I would ask you if I'm right, but I don't actually care.");
					} else {
						if (ans1.equals("mineral") && ans2.equals("no")) {
							System.out.println("My guess is that you are thinking of a paper clip.\r\n"
									+ "I would ask you if I'm right, but I don't actually care.");
						} else
							System.out.println("You're thinking of a Camaro!\r\n"
									+ "I would ask you if I'm right, but I don't actually care.");
					}
				}

			}

		}

	}
}
