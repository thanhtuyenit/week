import java.util.Scanner;

public class AddingValuesInALoop {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Number: ");
		int num = Integer.parseInt(input.nextLine());
		int sum = 0;
		System.out.println("The total so far is "+num);
		
		while (num != 0) {
			sum += num;
			System.out.print("Number: ");
			num = Integer.parseInt(input.nextLine());
			System.out.println("The total so far is "+sum);
			
		}
	}
}