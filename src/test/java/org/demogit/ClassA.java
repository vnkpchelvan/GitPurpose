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

	private void m6() {
		System.out.println("6");
	}

	private void m7() {
		System.out.println("7");
	}

	private void newM6() {
		System.out.println("newModule6");
	}

	private void newM7() {
		System.out.println("newModule7");
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		a.m6();
		a.m7();
		a.newM6();
		a.newM7();
	}

}
