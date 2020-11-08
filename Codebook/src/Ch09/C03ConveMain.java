package Ch09;

//고객
class C03Customer
{
	int Mymoney;
	String content;
	int cnt;
	C03Customer()
	{
		Mymoney=10000;
		content="텅빔";
		int cnt=0;
	}
	void Pay(int smoney,String PN , C03Convenience tmp)
	{
		Mymoney=Mymoney-smoney;
		content=PN;
		cnt=tmp.Receive(smoney, PN);
	}
	void ShowInfo()
	{
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("보유 제품 : " + content);
		System.out.println("제품 수량 : " + cnt);
	}
}
//편의점
class C03Convenience
{
	int Mymoney;
	int CoffeeCnt;		// 개당 가격 500
	int ColaCnt;		// 개당 가격 1000
	int sidarCnt;		// 개당 가격 1500
	C03Convenience()
	{
		Mymoney=10000;
		CoffeeCnt=100;ColaCnt=100;sidarCnt=100;
	}
	int Receive(int rmoney,String PN)
	{
		Mymoney=Mymoney+rmoney;
		int sendCnt=0;
		if(PN.equals("커피"))
		{
			CoffeeCnt=CoffeeCnt-(rmoney/500);
			sendCnt=rmoney/500;
		}
		else if(PN.equals("콜라"))
		{
			ColaCnt=ColaCnt-(rmoney/1000);
			sendCnt=rmoney/1000;
			
		}
		else if(PN.equals("사이다"))
		{
			sidarCnt=sidarCnt-(rmoney/1500);
			sendCnt=rmoney/1500;
		}
		return sendCnt;
	}
	void ShowInfo()
	{
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("커피 수량 : " + CoffeeCnt);
		System.out.println("콜라 수량 : " + ColaCnt);
		System.out.println("사이다 수량 : " + sidarCnt);
	}

}

public class C03ConveMain {

	public static void main(String[] args) {
		//편의점 객체
		C03Convenience GS25 = new C03Convenience();
		
		//고객객체
		C03Customer Kim = new C03Customer();
		C03Customer Lee = new C03Customer();
		C03Customer Son = new C03Customer();
		
		//구매전 정보확인
		System.out.println("------구 매 전--------");
		System.out.println("--고객--");
		Kim.ShowInfo();
		Lee.ShowInfo();
		Son.ShowInfo();
		System.out.println("--편의점--");
		GS25.ShowInfo();
		//제품구매 
		Kim.Pay(1500, "커피", GS25);
		Lee.Pay(2000, "콜라", GS25);
		Son.Pay(3000, "사이다", GS25);
		
		
		//구매후 정보확인
		System.out.println("------구 매 후--------");
		System.out.println("--고객--");
		Kim.ShowInfo();
		Lee.ShowInfo();
		Son.ShowInfo();
		System.out.println("--편의점--");
		GS25.ShowInfo();
		
		
		
	}

}
