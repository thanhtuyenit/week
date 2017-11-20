import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rd = new Random();
		int numGuess;
		int numRight = 1 + rd.nextInt(2);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\r\n"
				+ "He glances at you out of the corner of his eye and starts shuffling.\r\n"
				+ "He lays down three cards.");

		System.out.println("Which one is the ace?\r\n" + "\r\n" + "	##  ##  ##\r\n" + "	##  ##  ##\r\n" + "	1   2   3");
		System.out.print("> ");
		numGuess = Integer.parseInt(input.nextLine());
		if (numGuess == numRight) {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
		} else
			System.out.println("Ha! Fast Eddie wins again! The ace was card number " + numRight);
		System.out.print("\t");
		for (int i = 1; i < 4; i++) {
			if (i == numRight) {
				System.out.print("AA\t");
			} else
				System.out.print("##\t");
		}
		System.out.println();
		System.out.print("\t");
		for (int i = 1; i < 4; i++) {
			if (i == numRight) {
				System.out.print("AA\t");
			} else
				System.out.print("##\t");
		}
		System.out.println();
		System.out.print("\t");
		System.out.println("1\t2\t3");

	}
}