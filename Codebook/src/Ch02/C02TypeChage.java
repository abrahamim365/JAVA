package Ch02;

public class C02TypeChage {

	public static void main(String[] args) {
		
		//강제 형변환 - 프로그래머에 개입에 의한 형변환
		// 좁은 범위 공간에 큰값을 넣으려고 하는경우 사용
		// 기본적으로 불가능(컴파일러수준에서의 에러)하기 때문에 강제로 형변환하는경우에 해당
		// 데이터 손실가능성이 높다
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
	}

}
