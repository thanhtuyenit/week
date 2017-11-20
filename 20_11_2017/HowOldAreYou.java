import java.util.Scanner;

public class HowOldAreYou{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Hey, what's your name? ");
		name = keyboard.nextLine();
		System.out.print("Ok,"+name+" , how old are you? ");
		age = Integer.parseInt(keyboard.nextLine());
		if (age < 16) {
			System.out.println("You can't drive. " + name);
		}
		if (age < 18) {
			System.out.println("You can't vote. " + name);
		}
		if (age < 25) {
			System.out.println("You can't rent a car. " + name);
		}
		if (age >= 25)
			System.out.println("You can do anything that's legal." + name);
	}
}
