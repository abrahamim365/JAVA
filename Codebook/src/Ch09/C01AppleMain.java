package Ch09;


//구매자 Class
class Customer
{
	//속성
	int Mymoney;
	int AppleCnt;
	//메서드(생성자)
	Customer(int money)
	{
		Mymoney=money;
		AppleCnt=0;
	}
	void Pay(int smoney ,AppleSeller tmp)
	{
		Mymoney=Mymoney-smoney;
		int cnt=tmp.Receive(smoney);
		AppleCnt=AppleCnt + cnt;
	}
	void ShowInfo()
	{
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + AppleCnt);
	}
}
//판매자 Class
class AppleSeller
{
	//속성
	int Mymoney;
	int AppleCnt;
	AppleSeller(int money,int cnt)
	{
		Mymoney = money;
		AppleCnt=cnt;
	}
	int Receive(int rmoney)
	{
		Mymoney=Mymoney+rmoney;
		AppleCnt = AppleCnt - (rmoney/1000);
		return rmoney/1000;
		
	}
	void ShowInfo()
	{
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + AppleCnt);
	}
}


public class C01AppleMain {

	public static void main(String[] args) {
		//고객객체생성
		Customer Kim = new Customer(10000);
		Customer Lee = new Customer(10000);
		Customer Son = new Customer(10000);
		//판매자 객체생성
		AppleSeller seller = new AppleSeller(10000,100); 
		
		System.out.println("---------구매전 객체들 정보--------");
		Kim.ShowInfo();
		Lee.ShowInfo();
		Son.ShowInfo();
		seller.ShowInfo();
		//구매진행
		Kim.Pay(2000, seller);
		Lee.Pay(5000, seller);
		Son.Pay(7000, seller);
		System.out.println("---------구매후 객체들 정보--------");
		Kim.ShowInfo();
		Lee.ShowInfo();
		Son.ShowInfo();
		seller.ShowInfo();
		
		
	}

}
