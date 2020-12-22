package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani_1 = new Animal();
		ani_1.crying();
		Animal ani_2 = new Animal(2);
		ani_2.crying();
		Animal ani_3 = new Animal("나비",8);
		ani_3.crying();
		Animal ani_4 = new Animal("바둑이");
		ani_4.crying();
		
	}
}
