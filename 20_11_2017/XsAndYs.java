public class XsAndYs {

	public static void main(String[] args) {
		float x = -10;
		System.out.println("X\t\tY");
		System.out.println("----------------------");
		System.out.print(x);
		System.out.println("\t\t"+x*x);
		for (int i = 0; i < 40; i += 1) {
			x = (float) (x + 0.5);
			System.out.print(x);
			System.out.println("\t\t"+x*x);
		}

	}
}