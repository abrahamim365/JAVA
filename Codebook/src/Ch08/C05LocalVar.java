package Ch08;
//지역변수 : {} 내에 선언되어진 변수
class LocalTest
{
	int num1=10;	//LocalTest내의 지역변수(멤버변수)
	void Func1()
	{
		System.out.println("num1 = "+num1);// 멤버변수 num1
		if(true)
		{
			int num1=30;	
			System.out.println("num1="+num1);//if 안의 지역변수 num1
		}//중괄호 벗어나는 순간 if 안의 지역변수 num1의 공간반환
		System.out.println("num1 = "+num1);//멤버변수 num1
	}
	void FuncTest()
	{
		if(true)
		{
			int num100=50;
			System.out.println("num100 : "+num100);
		}
		//num100 = 30;	//왜 컴파일 오류가뜨는지? num100이 지역을 벗어나 공간소멸된 상태
	}
	void Func2()
	{
		int num1=20;
		System.out.println("num1 = "+num1);
	}
	void Func3()
	{
		int num1=30;
		System.out.println("num1 = "+num1);
	}
	
}
public class C05LocalVar {
	public static void main(String[] args) {
		LocalTest obj1 = new LocalTest();
		obj1.Func1();
		
	}
}
