import java.util.Scanner;

public class SpaceBoxing {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		float currentEarthWeight;
		int planet;
		System.out.print("Please enter your current earth weight: ");
		currentEarthWeight = Float.parseFloat(keyboard.nextLine());
		System.out.println("I have information for the following planets:");
		System.out.println("\t1. Venus   2. Mars    3. Jupiter\r\n" + "\t4. Saturn  5. Uranus  6. Neptune");
		System.out.print("Which planet are you visiting? ");
		planet = Integer.parseInt(keyboard.nextLine());
		if (planet == 1) {
			System.out.println("Your weight would be " + (currentEarthWeight * 0.78) + " pounds on that planet.");
		}else if(planet == 2 ) System.out.println("Your weight would be " + (currentEarthWeight * 0.39) + " pounds on that planet.");
		else if (planet == 3 ) System.out.println("Your weight would be " + (currentEarthWeight * 2.65) + " pounds on that planet.");
		else if (planet == 4 ) System.out.println("Your weight would be " + (currentEarthWeight * 1.17) + " pounds on that planet.");
		else if (planet == 5 ) System.out.println("Your weight would be " + (currentEarthWeight * 1.05) + " pounds on that planet.");
		else if (planet == 6 ) System.out.println("Your weight would be " + (currentEarthWeight * 1.23) + " pounds on that planet.");
		
	}
}
