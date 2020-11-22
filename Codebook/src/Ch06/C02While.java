package Ch06;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//모든 구구단 출력(2단 - 9단)
		/*
		int dan=2;
		int su=1;
		while(dan<=9)
		{
			su=1;
			while(su<=9)
			{
				System.out.println(dan+" * " + su+" = "+(dan*su));
				su++;
			}
			System.out.println();
			dan++;
		}
		*/
		
		//모든 구군 출력(9단 - 2단)
		//9*9 = 81 , 9*8=72 ..
		
		/*
		int dan=9;
		int su=9;
		while(dan>1)
		{
			su=9;
			while(su>0)
			{
				System.out.println(dan+" * " + su+" = "+(dan*su));
				su--;
			}
			System.out.println();
			dan--;
		}
		*/
		
		//03 별찍기
		
		//*****
		//*****
		//*****
		//*****

//		i	j(*)
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//			j=0;
//			j<5;
		
		/*
		int i=0;	//개행 반복 탈출용 변수
		int j=0;	//별찍기 반복 탈출용 변수
		
		while(i<4)
		{
			j=0;
			while(j<5)
			{
				System.out.printf("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
		*/
		
		
		//04 별찍기
		//*
		//**
		//***
		//****
		
		/*
		int i=0;
		int j=0;
		
		while(i<4)
		{
			j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		
//		****
//		***
//		**
//		*
//		i	j
//		0	0-3
//		1	0-2
//		2	0-1
//		3	0-0
//			j=0;
//			j<=3-i
		
		/*
		int i=0;
		int j=0;
		while(i<4)
		{
			j=0;
			while(j<=3-i)
			{
				System.out.printf("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
		*/
		
//		    *
//		   ***
//		  *****
//		 *******
//
//		 i	j(공백)	k(*)
//		 0	0-2	0-0
//		 1	0-1	0-2
//		 2	0-0	0-4
//		 3	X	0-6
//		 	j=0	k=0
//		 	j<=2-i	k<=2*i

		/*
		 int i=0;	//개행
		 int j=0;	//공백
		 int k=0;	//별찍기
		 int num=0;

		 while(i<4)
		 {
			 j=0;
			 while(j<=2-i)
			 {
				 System.out.print(" ");
				 j++;
			 }
			 k=0;
			 while(k<=2*i)
			 {
				 System.out.print("*");
				 k++;
			 }
			 System.out.println();
			 i++;
		 }
		*/
		
		

//*******
// *****
//  ***
//   *
//
//i	j	k
//0	X	0-6
//1	0-0	0-4
//2	0-1	0-2
//3	0-2	0-0
//	j=0;	k=0
//	j<=i-1	k<=6-2*i

		/*
		int i=0;
		int j=0;
		int k=0;
		
		while(i<4)
		{
			j=0;
			while(j<=i-1)
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=6-2*i)
			{
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			i++;
		}
		*/
		
		/*
		   *
		   ***
		  *****
		 *******
		  *****
		   ***
		    *

		 i	j	k
		 0	0-2	0-0
		 1	0-1	0-2
		 2	0-0	0-4
		 3	X	0-6
		 ------------------------
		 	j=0	k=0
		 	j<=2-i	k<=2*i

		 4	0-0	0-4
		 5	0-1	0-2
		 6	0-2	0-0
		 ------------------------
		 	j=0	k=0
		 	j<=i-4	k<=12-(2*i)
		
		 */
		 
		
		/*
		int i=0;
		int j=0;
		int k=0;
		
		while(i<7)
		{
			if(i<4)
			{
				j=0;
				while(j<=2-i)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
				
			}
			else
			{
				j=0;
				while(j<=i-4)
				{
					System.out.print(" ");
					j++;
				}
				k=0;
				while(k<=12-(2*i))
				{
					System.out.print("*");
					k++;
				}
				
			}
			System.out.println();
			i++;
		}
		*/
		
		//문제
		
//		*******
//		 *****
//		  ***
//		   *
//		  ***
//		 *****
//		*******
		
		//문제 : 입력한 대로 모양이 완성될 수 있도록
		//수 입력  : 3	
		
//		   *
//		  ***
//		 *****
		
		/*
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=0; //줄바꿈용
		int j=0; //공백용
		int k=0; //별찍기용
		while(i<num)
		{
			j=0;
			while(j<=num-2-i)
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=2*i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
					
		*/
	
		
		
		
		
		
		
		
		
	}

}
