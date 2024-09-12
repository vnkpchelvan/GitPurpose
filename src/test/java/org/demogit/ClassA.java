package org.demogit;

public class ClassA {

	private void m1() {
		System.out.println("1");

	}

	private void m2() {
		System.out.println("2");

	}

	private void m3() {
		System.out.println("3");
	}

	private void m4() {
		System.out.println("4");
	}

	private void m5() {
		System.out.println("5");
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
	}

}
