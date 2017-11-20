import java.util.Scanner;
public class TheForgetfulMachine{
	private static Scanner keyboard;

	public static void main( String[] args )
	{
		keyboard = new Scanner(System.in);
		int num1,num2;
		String str1,str2;
		System.out.println("Give me a word!");
		str1 = keyboard.nextLine();
		System.out.println("Give me a second word!");
		str2 = keyboard.nextLine();
		System.out.println("Great, now your favorite number?");
		num1 = keyboard.nextInt();
		System.out.println("And your second-favorite number...");
		num1 = keyboard.nextInt();
		System.out.println("Whew!  Wasn't that fun?");
	}
}