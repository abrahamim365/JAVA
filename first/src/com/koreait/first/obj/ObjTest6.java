package com.koreait.first.obj;

public class ObjTest6 {

	public static NumberBox2 copyObj(NumberBox2 nbb) {
		NumberBox2 newNbx = new NumberBox2();
		newNbx.a = nbb.a;
		newNbx.b = nbb.b;
		return newNbx;
	}
	
	public static void main(String[] args) {
		NumberBox2 nbb = new NumberBox2();
		nbb.a = 11;
		nbb.b = 22;
		
		NumberBox2 nbb2 = copyObj(nbb);
		nbb2.b = 40;
		
		NumberBox2 nbb3 = copyObj(nbb2);
		nbb3.a = 30;
		
		System.out.println("nbb : "+nbb.sum());
		System.out.println("nbb2 : "+nbb2.sum());
		System.out.println("nbb3 : "+nbb3.sum());
	}
	

}
