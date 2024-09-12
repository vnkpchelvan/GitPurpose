package org.demogit;

public class ClassB {
	
	private void n1() {
		System.out.println("1");
	}
	private void n2() {
		System.out.println("2");

	}
	private void n3() {
		System.out.println("2");

	}
	public static void main(String[] args) {
		
		ClassB b = new ClassB();
		b.n1();
		b.n2();
		b.n3();
	}

}
