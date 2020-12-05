package beginner.loop;

public class While {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+",");
		}
		
		System.out.println();
		
		int i=0;
		while(i<5) {
			System.out.print(i +", ");
			i++;
		}
		
		System.out.println();
		
		
		int j=0;
		while(true) {
			if(j == 5)
				break;
		
		System.out.print(j + ",");
		j++;
		}
	
	
		int z=0;
		for(;z<10;z++) {
			System.out.print(z);
			
		}

	}
}
