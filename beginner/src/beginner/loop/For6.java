package beginner.loop;

public class For6 {

	public static void main(String[] args) {
		int star = 6;
		for (int i = 0; i < star; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
