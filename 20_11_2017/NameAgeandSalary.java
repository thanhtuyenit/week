import java.util.Scanner;

public class NameAgeandSalary{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		int age,salary;
		String name;
		System.out.println("Hello.  What is your name?");
		name = keyboard.nextLine();
		System.out.println("Hi "+name+"! How old are you?");
		age = keyboard.nextInt();
		System.out.println("So you're "+age+", eh?  That's not old at all!\nHow much do you make "+name+"?");
		salary = keyboard.nextInt();
		System.out.println(salary+"!  I hope that's per hour and not per year! LOL!");
	}
}