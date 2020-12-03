package beginner.loop;

public class For7 {

	public static void main(String[] args) {
		int star = 10;
		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < star; j++) {
				if (star - i > j) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for (int i = star; i >0; i--) {
			for (int j = 1; j <= args.length; j++) {
					if(i>j) {
						System.out.print(" ");
					} else {
						System.out.println("*");
					}
			}
			System.out.println();
		}

	}

}
