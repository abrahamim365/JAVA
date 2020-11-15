package Ch03;

import java.util.Scanner; // Scanner 클래스 자료형 사용을 위한 경로 설정

public class C01Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//키보드로 부터 입력받기 기능이 포함된 장치를 만드는작업
												// new Scanner() : 장치형성 코드
												// System.in : 표준입력장치(ex.키보드)
		
		
		int num1 = sc.nextInt();	//입력장치의 정수값을 입력받는 함수로인해 키보드로부터 데이터가 입력될때까지
									//Block이 되어지고, 정수값을 입력하는 순간 num1 변수공간에 대입
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d\n",num1,num2,num3,sum);
		sc.close();
	}

}
