package Ch02;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129;	//00000000 00000000 00000000 10000001
		int num2 = 130;	//00000000 00000000 00000000 10000010
		byte b1 = (byte)num1;	// 10000001
		byte b2 = (byte)num2; //10000010
		
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
