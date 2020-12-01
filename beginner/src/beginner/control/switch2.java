package beginner.control;

import java.util.Scanner;

import beginner.scan;


public class switch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성별을 입력해주세요");
		String gender = scanner.nextLine();
		
		int avg=0;
		
		switch(gender) {
		case "남":
		case "남자":
		case "man":
			avg=166;
			break;
			
		case "여":
		case "여자":
		case "woman":
			avg = 157;
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		
		}
		
		
		
		if(avg>0) {
			System.out.print("키를 입력해 주세요 : ");
			int height= scanner.nextInt();
			
			if(height > avg) {
				System.out.println("평균 초과입니다.!!!");
			} else if (height < avg) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다");
			}
		}	
			
			
	}

}





