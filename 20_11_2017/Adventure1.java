import java.util.Scanner;

public class Adventure1{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String ans1, ans2, ans3;
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println(
				"You are in a creepy house!  Would you like to go \"upstairs\" or into the\r\n" + "\"kitchen\"?");
		System.out.print(">");
		ans1 = input.nextLine();
		if (ans1.equals("kitchen")) {
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\r\n"
					+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\r\n"
					+ "or look in a \"cabinet\".");
			System.out.print(">");
			ans2 = input.nextLine();
			if (ans2.equals("refrigerator")) {
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\r\n"
						+ "Would you like to eat some of the food? (\"yes\" or \"no\")");
				System.out.print(">");
				ans3 = input.nextLine();
				if (ans3.equals("yes")) {
					System.out.println("Win!!!!");
				} else {
					System.out.println("You die of starvation... eventually.");
				}
			} else {
				System.out.println("You die of starvation... eventually.");
			}
		} else {
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\r\n"
					+ "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\r\n"
					+ "to go?");
			System.out.print(">");
			ans2 = input.nextLine();
			if (ans2.equals("bedroom")) {
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\r\n"
						+ "bed is unmade.  In the back of the room,");
				System.out.print(">");
				ans3 = input.nextLine();
				if (ans3.equals("yes")) {
					System.out.println("Win!!");
				}else {
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\r\n" + 
							"I'm tired of making nested if statements.");
				}
			}else {
				System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\r\n" + 
						"I'm tired of making nested if statements.");
			}
		}
	}
}