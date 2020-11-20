package Ch04;

public class C01ArithMethic {

	public static void main(String[] args) {
		
		//01기본산술연산자
		
		/*
		int a = 10, b=21,c;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("b/a="+(b/a));		
		System.out.println("b%a="+(b%a));	//중요!!
		*/
		
		//[미니문제] 두수를 입력받아 두수의 합/차/곱을 출력하는 프로그램을 만드세요
		//Scanner를 이용함. 집에서 풀어보세요 ^^ 
		
		
		//02복합 대입연산자
		//  a=a+b == a+=b;
		//  a=a-b == a-=b;
		//  a=a*b == a*=b;
		
		/*
		int a=10,b=20;
		System.out.println("a=a+b :"+(a+=b));
		*/
		
		//03논리연산자
		// && : AND 연산자 , 두 피연산자비교시 왼쪽오른쪽 둘다 true 이면 true를 반환
		// || : OR 연산자, 두 피연산자 비교시 왼쪽,오른쪽 둘중 하나만 true 이면 true를 반환
		
		/*
		System.out.println("true AND true ="+(true && true));
		System.out.println("true AND false ="+(true && false));
		System.out.println("false AND true ="+(false && true));
		System.out.println("false AND false ="+(false && false));
		
		System.out.println("true OR true ="+(true || true));
		System.out.println("true OR false ="+(true || false));
		System.out.println("false OR true ="+(false || true));
		System.out.println("false OR false ="+(false || false));
		*/
		
		//04논리 부정 연산자(! : true 일때 false로 , false일때 true로 변환)
		
		/*
		boolean play = true;
		System.out.println(play);
		play = !play;
		System.out.println(play);
		*/
		
		//05비교 연산자( == , > , >= , < , <= , !=)
		
		/*
		int a=10;
		int b=20;
		
		System.out.println("A==B : "+(a==b));
		System.out.println("A >B : "+(a>b));
		System.out.println("A <B : "+(a<b));
		System.out.println("A>=B : "+(a>=b));
		System.out.println("A<=B : "+(a<=b));
		System.out.println("A!=B : "+(a!=b));
		*/
		
		//06증감 연산자(++ : 1증가,-- : 1감소)
		//전치연산 : 값증가 후 다른연산시도
		//후치연산 : 다른연산 처리 후 값증가
		
		/*
		int a = 10, b = 10, c , d;
		c =--a+b--;	// a=9 , b=9(다른연산처리한뒤 감소) , c=19
		d = a-- + ++b; // a=8(다른연산처리 한뒤 감소) , b=10 , d =19
		System.out.printf("a=%d b=%d c=%d d=%d\n",a,b,c,d);
		*/
		
		
		//07삼항연산자
		//(조건식)? 조건식이참일경우실행 : 조건식이 거짓인경우실행 ;
		/*
		int score=70;
		char grade = (score >90) ? 'A':((score>80)?'B':'C');
		System.out.println(score + "점은 "+grade + "등급입니다.");
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
