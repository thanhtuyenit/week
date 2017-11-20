import java.util.Scanner;

public class TwoMoreQuestions{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		String ans1, ans2;
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("Think of something and I'll try to guess it!");
		System.out.print("Question 1) Does it stay inside or outside or both? ");
		ans1 = input.nextLine();
		System.out.print("Question 2) Is it a living thing? ");
		ans2 = input.nextLine();
		if (ans1.equals("inside")) {
			if (ans2.equals("yes")) {
				System.out.println("Then what else could you be thinking of besides a houseplant");
			} else {
				System.out.println("Then what else could you be thinking of besides a shower curtain");
			}
		} else {
			if (ans1.equals("outside")) {
				if (ans2.equals("yes")) {
					System.out.println("Then what else could you be thinking of besides a bision");
				} else {
					System.out.println("Then what else could you be thinking of besides a billboard");
				}
			} else {
				if (ans2.equals("yes")) {
					System.out.println("Obviously the nonliving, inside/outside thing on your mind is a dog!");
				} else {
					System.out.println("Obviously the nonliving, inside/outside thing on your mind is a cell phone!");
				}
			}
		}
	}
}