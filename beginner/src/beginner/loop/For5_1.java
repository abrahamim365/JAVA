package beginner.loop;

public class For5_1 {

	public static void main(String[] args) {
		int star = 6;
		
		String result="";
		
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star; j++) {
				result += "*";
			}
			result += "\n";
		}
		
		System.out.println(result);
	}

}
