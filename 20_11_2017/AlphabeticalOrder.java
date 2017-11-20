import java.util.Scanner;

public class AlphabeticalOrder{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String name;
		System.out.print("What's your last name? ");
		name = input.nextLine();
		if (name.compareTo("Carswell") <= 0) {
			// when name is "Carswell" or before
			System.out.print("you don't have to wait long, ");
		} else {
			if ((name.compareTo("Carswell") > 0) && (name.compareTo("Jones") <= 0)) {
				// when name is "Jones" or before
				System.out.print("that's not bad, ");
			} else {
				if ((name.compareTo("Jones") > 0) && (name.compareTo("Smith") <= 0)) {
					// name is "Smith" or before: say "looks like a bit of a wait"
					System.out.print("looks like a bit of a wait, ");
				} else {
					if ((name.compareTo("Smith") > 0) && (name.compareTo("Young") <= 0)) {
						// name is "Young" or before: say "it's gonna be a while"
						System.out.print("it's gonna be a while, ");
					} else {
						if ((name.compareTo("Young") > 0)) {
							// name is after "Young": say "not going anywhere for a while?"
							System.out.print("not going anywhere for a while? ");
						}
					}
				}
			}
		}
		System.out.print("\"" + name + "\"");
	}
}