public class YourSchedule{
	public static void main(String args[]) {
		String course1 = "English III";
		String course2 = "Precalculus";
		String course3 = "Music Theory";
		String course4 = "Biotechnology";
		String course5 = "Principles of Technology I";
		String course6 = "Latin II";
		String course7 = "AP US History";
		String course8 = "Business Computer";
		String teacher1 = "Ms. Lapan";
		String teacher2 = "Mrs. Gideon";
		String teacher3 = "Mr. Davis";
		String teacher4 = "Ms. Palmer";
		String teacher5 = "Ms. Garcia";
		String teacher6 = "Mrs. Barnett";
		String teacher7 = "Ms. Johannessen";
		String teacher8 = "Mr. James";
		System.out.print("+");
		for (int i = 0; i < 47; i++)
			System.out.print("-");
		System.out.println("+");
		System.out.format("| 1 |%26s", course1);
		System.out.print("|");
		System.out.format("%15s", teacher1);
		System.out.println(" |");
		System.out.format("| 2 |%26s", course2);
		System.out.print("|");
		System.out.format("%15s", teacher2);
		System.out.println(" |");
		System.out.format("| 3 |%26s", course3);
		System.out.print("|");
		System.out.format("%15s", teacher3);
		System.out.println(" |");
		System.out.format("| 4 |%26s", course4);
		System.out.print("|");
		System.out.format("%15s", teacher4);
		System.out.println(" |");
		System.out.format("| 5 |%26s", course5);
		System.out.print("|");
		System.out.format("%15s", teacher5);
		System.out.println(" |");
		System.out.format("| 6 |%26s", course6);
		System.out.print("|");
		System.out.format("%15s", teacher6);
		System.out.println(" |");
		System.out.format("| 7 |%26s", course7);
		System.out.print("|");
		System.out.format("%15s", teacher7);
		System.out.println(" |");
		System.out.format("| 8 |%26s", course8);
		System.out.print("|");
		System.out.format("%15s", teacher8);
		System.out.println(" |");
		System.out.print("+");
		for (int i = 0; i < 47; i++)
			System.out.print("-");
		System.out.println("+");
	}
}