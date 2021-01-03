package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachine {
	private Scanner scan;
	private Can[] canArr;
	private int sum;
	
	
	public VendingMachine() {
		init();
	}
	
	public void init() {
		scan = new Scanner(System.in);
		String[] nmArr = {"콜라","사이다","솔의눈","데지와","환타"};
		int[] priceArr = {500,600,700,800,900};
		canArr = new Can[nmArr.length];
		for (int i = 0; i < canArr.length; i++) {
			canArr[i]= new Can(nmArr[i],priceArr[i]);
		}
	}
	
	public void showMenus() {
		System.out.println("--메뉴--");
		for (int i = 0; i < canArr.length; i++) {
			Can can = canArr[i];
			System.out.printf("%d. %s - (%, d원)\n",
					i+1,can.getNm(),can.getPrice());
		}
	}
	
	public void purchase() {
		System.out.println("메뉴선택(종료:0)");
		while(true) {
			int choice = scan.nextInt();
			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > canArr.length) {
				System.out.println("잘 못 입력하셨습니다");
			}
			sum += canArr[choice-1].getPrice();
		}
		
	}
	
	public void showSum() {
		System.out.printf("총 합: %d\n",sum);
	}
}
