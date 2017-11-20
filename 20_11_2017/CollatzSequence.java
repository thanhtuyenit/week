import java.util.Scanner;

public class RightTriangleChecker {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n;
		System.out.print("Starting number: ");
		n = input.nextInt();
		int line = 3;
		int count = 0;
		int max = n;
		System.out.print(n + "\t");
		while (n != 1) {
			count++;
			if (n % 2 == 0) {
				// n even
				n = n / 2;
				System.out.print(n + "\t");
			} else {
				n = 3 * n + 1;
				System.out.print(n + "\t");
			}

			if (line == 11) {
				System.out.println();
				line = 1;
			}
			line++;
			if (n >= max)
				max = n;
		}
		System.out.println("\nTerminated after "+max+" steps.The largest value was " + count);
	}
}