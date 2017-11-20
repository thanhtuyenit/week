public class ForLoopChallenge {

	public static void main(String[] args) throws InterruptedException {
		for (int j = 15; j <= 30; j += 5) {
			System.out.println(j); 
			Thread.sleep(3000);
		}
	}
}