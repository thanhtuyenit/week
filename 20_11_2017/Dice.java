import java.util.Random;

public class Dice{

	public static void main(String[] args) {
		Random rd = new Random();
		int num1 = 1 + rd.nextInt(6);
		int num2 = 1 + rd.nextInt(6);
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll #1: " + num1);
		System.out.println("Roll #1: " + num2);
		System.out.println("The total is " + (num1 + num2));
	}
}