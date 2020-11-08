package Ch01;

public class C04변수자료형 {

	public static void main(String[] args) {
		
		
		int num1=0; 	// 4byte 정수공간에 num1변수명 부여 
		int num100 = num1;
		num1=10;	// 10이라는 수를 num1공간에 저장
		int num2=4;	// 4라는 수를 4byte 정수 num2공간에 초기화
		int num3 = num1 + num2; // num1값 + num2값 의 결과를 num3변수공간에 대입
		System.out.println(num3);
		
		//대입연산자(=)를 기준으로 왼쪽은 공간/ 오른쪽은 값으로 해석
		//함수의 인자로 변수명이 들어가는 경우 변수명안의 값으로 해석
		

		

	}

}
