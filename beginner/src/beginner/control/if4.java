package beginner.control;

import java.util.Scanner;

public class if4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요");
		String gender = scan.next();
		System.out.println("키를 입력해주세요");
		int height = scan.nextInt();
		
		if("남자".equals(gender)) {
			if(height>166) {
				System.out.println("평균 초과입니다");
			} else if (height<165) {
				System.out.println("평균 미만입니다");
			} else {
				System.out.println("평균입니다");
			}
		} else if ("여자".equals(gender)) {
			if(height>157) {
				System.out.println("평균 초과입니다");
			} else if(height<157) {
				System.out.println("평균 미만입니다");
			} else {
				System.out.println("평균입니다");
			}
		}
		
		scan.close();

	}

}
