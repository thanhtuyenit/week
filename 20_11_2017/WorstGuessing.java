import java.util.Scanner;

public class WorstGuessing{

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int numYourGues;
		int numRight = 4;
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!!");
		System.out.print("I\'M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		numYourGues = Integer.parseInt(input.nextLine());
		if (numRight == numYourGues) {
			//right
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS! "+numRight);
		}else {
			//not right
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS ! "+numRight);
			
		}
	}
}