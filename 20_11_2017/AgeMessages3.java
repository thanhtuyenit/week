import java.util.Scanner;
public class AgeMessages3{
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Your name: ");
		name = input.nextLine();
		System.out.print("Your age: ");
		age = Integer.parseInt(input.nextLine());
		if (age < 16)
			System.out.println("You can't drive. " + name);
		if ((age >= 16) && (age < 18))
			System.out.println("You can drive but not vote. " + name);
		if ((age >= 18) && (age < 25))
			System.out.println("You can vote but not rent a car. " + name);
		if (age >= 25)
			System.out.println("You can do pretty much anything. " + name);
	}
}
