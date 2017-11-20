import java.util.Scanner;

public class AddingValuesForLoop{
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		int n, sum = 0;
		System.out.print("Number: ");
		n = kb.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i+" ");
			if (sum != n)
				sum += i;
		}
		System.out.println("\nThe sum is: " + sum);

	}
}