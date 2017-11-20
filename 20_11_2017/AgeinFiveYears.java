import java.util.Scanner;

public class AgeinFiveYears{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Hello.  What is your name? ");
		name = keyboard.nextLine();
		System.out.print("Hi, " + name + " ! How old are you? ");
		age = Integer.parseInt(keyboard.nextLine());
		System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
		System.out.println("And five years ago you were " + (age - 5) + " ! Imagine that!");

	}
}