import java.util.Scanner;

public class BMICalc{
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		float height, weight;
		System.out.print("Your height in m: ");
		height = Float.parseFloat(keyboard.nextLine());
		System.out.print("Your weight in kg: ");
		weight = Float.parseFloat(keyboard.nextLine());
		System.out.print("Your BMI is " + (weight / (height * height)));

	}
}