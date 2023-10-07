package com.jsp.polymorphism;

public class B extends A {
	@Override
	public void m2() {
		System.out.println("m2() overriden by B");

	}

	public static void m1() {
		System.out.println("sastic method m1 in B");
	}

}
