package org.demogit;

public class ClassA {
	
	private void m1() {
		System.out.println("1");
		
	}
	private void m2() {
		System.out.println("2");
		
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
		a.m2();
	}
	

}
