package Ch08;
class C11Car
{
	//속성
	String owner;
	int speed;
	int fuel;


	
	//기능
	void Accel()
	{
		
		fuel=fuel-5;//연료량 5씩감소
		if(fuel<0)//연료량 0 이라면 speed 0
		{
			System.out.println("연료량 부족...");
			return ;
		}
			
		speed+=10; //스피드 값 증가(+10)
		if(speed>200)//최대시속 200KM(만약 스피드가 200을 초과되면 speed : 200)
		{
			speed=200;
			System.out.println("최대 속력입니다(200Km/h)");
		}
		else
		{
			System.out.println(owner + "님 의 차를 가속합니다.현재속력 : "+speed);
		}
		
	}
	void Break()
	{
		speed=speed-10;//스피드 값 감소(-10)
		if(speed<=0)//스피드 0이하로 내려간다면 정지("차가 정지합니다" 가 출력)
		{
			speed=0;
			System.out.println("차가 정지합니다");
		}
		else
		{
			System.out.println(owner +" 님의 차를 감속합니다, 현재속도 : " +speed+"Km/h");
		}
		
	}
	//생성자메서드
	//디폴트생성자 호출시 owner="미정",speed=0 , fuel=50
	C11Car()
	{
		owner="미정";
		speed=0;
		fuel=50;
	}
	
	//생성자(String tmp) -> owner=tmp , speed=0, fuel=60
	C11Car(String tmp)
	{
		owner=tmp;
		speed=0;
		fuel=60;
	}
	
	//생성자(String tmp, int f) ->owner=tmp, fuel=f;
	C11Car(String tmp , int f)
	{
		owner = tmp;
		speed=0;
		fuel=f;
	}
	
	//자동차 객체의 멤버정보를 출력할 메서드 지정
	//void ShowInfo(){ 소유자명 출력 , 현재스피드출력 , 현재연료량 출력}
	void ShowInfo()
	{
		System.out.println(owner + "," + speed+","+fuel);
	}
}
public class C11CarMain {

	public static void main(String[] args) {
		C11Car Jung = new C11Car();
		Jung.ShowInfo();
		C11Car Kim = new C11Car("김정은");
		Kim.ShowInfo();
		C11Car Lee = new C11Car("이소룡", 80);
		Lee.ShowInfo();

	}

}



