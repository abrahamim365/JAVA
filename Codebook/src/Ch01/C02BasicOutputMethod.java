package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		//System : 시스템(OS)
		//out 	: 출력장치(모니터)
		//System.out.print() : 콘솔 화면에 () 안의 Data를 출력하는 기본 메서드
		
		//ESCAPE문자 : 제어문자(줄바꿈, tab,ESC 등의 기능구현)를 이용하기 위해 지정된 문자
		//			 문자앞에 \를 붙여줌 	ex . \n:줄바꿈 \t: tab크기만큼 이동
		System.out.print("HelloWorld\n");
		System.out.print("HelloWorld\n");
		System.out.print("\tHello\tWorld\n");
		
		//문제
		//   *
		//  ***
		// *****
		//*******
		System.out.print("   *\n");
		System.out.print("  ***\n");
		System.out.print(" *****\n");
		System.out.print("*******\n");
		
		//System.out.printf() : 서식 문자를 이용한 콘솔화면 출력메서드
		//서식 : 서류를 꾸미는 일정한 양식
		
		System.out.printf("%d %d %d\n", 10,20,30);			//%d : 10진 정수 서식
		System.out.printf("%f %f %f\n", 10.1 , 20.1 , 30.2);//%f : 10진 실수 서식
		System.out.printf("%c %c %c\n", 'A','B','C');		//%c : 단일 문자 서식
		System.out.printf("%s %s %s\n", "this is","String","Test");	//%s : 문자열 서식
		
		
		//문제
		//서식문자를 이용해서 다음과 같은 문장을 완성하세요
		//나의 이름은 %s 입니다
		//나의 성별은 %c 입니다 M/W
		//나의 나이는 %d 입니다 
		System.out.printf("나의 이름은 %s 입니다\n", "정우균");
		System.out.printf("나의 성별은 %c 입니다\n", 'M');
		System.out.printf("나의 나이는 %d 입니다\n", 35);
		
		
		//System.out.println() : 자동줄바꿈 포함 메서드
		
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		
		
		// 특수한 기능문자의 표현
		// Escape 문자 : \ 를 붙임
		// 서식문자  : %를 붙인다
		
		System.out.println("오늘 강수량은 10% 입니다\n");
		System.out.println("They say \"Hello?\" ");
	}
}






