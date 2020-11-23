package Ch07;

public class C01For {

	public static void main(String[] args) {
		
		
		/*
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello World");
		}
		
		for(int i=1;i<=9;i++)
		{
			System.out.println("2 * "+i+" = "+(2*i));
		}
		*/
		
		//2단부터 9단까지
		int dan;
		int i=1;
		for(dan=2;dan<=9;dan++)
		{
			for(i=1;i<=9;i++)
			{
				System.out.println(dan +" * " + i + " = "+(dan*i));
			};
			System.out.println();
		}
		
		
	}

}
