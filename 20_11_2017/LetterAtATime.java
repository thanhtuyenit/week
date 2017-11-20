import java.util.Scanner;

public class LetterAtATime {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out
				.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for (int i = 0; i < message.length(); i++) {
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int aCount = 0;
		int uCount = 0;
		int eCount = 0;
		int oCount = 0;
		int iCount = 0;
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			if (letter == 'a' || letter == 'A') {
				aCount++;
			}
			if (letter == 'u' || letter == 'U') {
				uCount++;
			}
			if (letter == 'e' || letter == 'E') {
				eCount++;
			}
			if (letter == 'o' || letter == 'O') {
				oCount++;
			}
			if (letter == 'i' || letter == 'I') {
				iCount++;
			}
		}

		System.out.println("\nYour message contains the letter 'a' " + aCount + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'u' " + uCount + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'e' " + eCount + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'o' " + oCount + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'i' " + iCount + " times. Isn't that interesting?");
		

	}
}