package beginner.loop;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
	
		int result=0;
		int val=0;
		Scanner scan= new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요.(종료:0)");
			val = scan.nextInt();
			result += val;
		}while(val!=0);
		System.out.printf("총 합 :%d ",result);
	}

}
