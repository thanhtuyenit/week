import java.util.Scanner;

public class DumbCalculator{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		float num1, num2, num3;
		System.out.print("What is your first number? ");
		num1 = Float.parseFloat(keyboard.nextLine());
		System.out.print("What is your second number? ");
		num2 = Float.parseFloat(keyboard.nextLine());
		System.out.print("What is your third number? ");
		num3 = Float.parseFloat(keyboard.nextLine());
		System.out.print("( " + num1 + " + " + num2 + " + " + num3 + " ) is.. " + ((num1 + num2 + num3) / 2));

	}
}