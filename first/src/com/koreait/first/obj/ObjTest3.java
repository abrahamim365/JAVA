package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest3 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 9, 3 };
		//int arr[]
		//arr을 정렬하는 orderBy메소드를 정의해 주세요.
		orderby(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void orderby(int[] arr) {
		Arrays.sort(arr);
	}

}


