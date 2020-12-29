package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassC("B",20);
		
		ClassC cc = (ClassC)cb;
		cc.print();
	}

}
