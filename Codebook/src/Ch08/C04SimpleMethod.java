package Ch08;

import java.util.Scanner;

class SumClass
{
	//속성
	Scanner sc= new Scanner(System.in);
	
	//sum1함수 : 두개의 값을 받아서 함수를 실행(call)한 위치로 더한값을 리턴
	int sum1(int x,int y)
	{
		return x+y;
	}
	
	//sum2함수 : 두개의 값을 인자로 받아서 더한 값을 화면에 출력하고 실행(call)한 위치로 돌아감
	void sum2(int x,int y)
	{
		System.out.println("두개의 합 : "+(x+y));
	}
	
	//sum3함수 : 두개의 값을 키보드로 받아서 더한값을 함수를 실행(call)한 위치로 전달
	int sum3()
	{
		System.out.print("두 수 입력 :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
		
	}
	//sum4함수 : 두개의 값을 키보드로 받아서 더한값을 화면에 출력하고 실행(call)한 위치로 돌아감
	void sum4()
	{
			System.out.print("두 수 입력:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("두 수의 합:"+ (x+y));
	}
	
	//[문제] sub1, sub2 sub3 sub4 함수를 만들어보고 메인메서드에서 사용해보세요
	// void sub1 ()
	
}

class Subclass
{
	//속성 : 멤버변수
	Scanner sc= new Scanner(System.in);
	
	//기능 : 멤버메서드
	void sub1()
	{
		System.out.print("두 수 입력:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("두 수의차 :" +(x-y));
	}
	
	 void sub2 (int x ,int y)
	{
		System.out.print("두 수의 차 :"+(x-y));
	}
	
	 int  sub3 (int x, int y)
	{
		return x-y;
	}
	 int  sub4()
	 {
		 System.out.print("두수 입력:");
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 return x-y;
	 }
}


public class C04SimpleMethod {

	public static void main(String[] args) {
		SumClass obj1 = new SumClass();
		int result=0;
		//sum1함수 : 인수값o 반환값 o
		result=obj1.sum1(10,20);
		System.out.println("두 수의합"+result);
		//sum2함수 : 인수값 o , 반환값 x
		obj1.sum2(100,200);
		
		//sum3함수 : 인수값 x , 반환값 o
		result=obj1.sum3();
		System.out.println("두 수의합"+result);
		
		//sum4함수 : 인수값 x , 반환값 x
		obj1.sum4();
		
		
		
		Subclass obj2 = new Subclass();
		
		
		//sub1함수 : 인수값x 반환값 x
		obj2.sub1();
		
		
		//sub2함수 : 인수값 o , 반환값 x
		obj2.sub2(30, 20);
		
		//sub3함수 : 인수값 o , 반환값 o
		result=obj2.sub3(30, 20);
		System.out.println("두수의 차:"+result);
		//sub4함수 : 인수값 x , 반환값 o
		result=obj2.sub4();
		System.out.println("두수의 차:"+result);
		
		
		
		
		
		
		
		
		
	}
}



