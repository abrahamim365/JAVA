package com.koreait.first.obj3;

public class ClassA {
	private String name;
	private int age;
	
	public ClassA(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("A: "+name+", "+age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
