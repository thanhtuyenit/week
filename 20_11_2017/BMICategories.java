import java.util.Scanner;

public class BMICategories {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		float height, weight;
		float result;
		String category = "";
		System.out.print("Your height in m: ");
		height = Float.parseFloat(keyboard.nextLine());
		System.out.print("Your weight in kg: ");
		weight = Float.parseFloat(keyboard.nextLine());
		System.out.println("Your BMI is " + (weight / (height * height)));
		result = (weight / (height * height));
		if (result < 15) {
			category = "very severely underweight";
		}
		if ((result >= 15) && (result <= 16)) {
			category = "severely underweight";
		}
		if ((result >= 16.1) && (result <= 18.4))
			category = "underweight";
		if ((result >= 18.5) && (result <= 24.9))
			category = "normal weight";
		if ((result >= 25.0) && (result <= 29.9))
			category = "overweight";
		if ((result >= 30.0) && (result <= 34.9))
			category = "moderately obese";
		if ((result >= 35) && (result <= 39.9))
			category = "severely obese";
		if (result >= 40)
			category = "very severely (or\"morbidly\") obese";
		System.out.println("BMI Category: "+category);
	}
}