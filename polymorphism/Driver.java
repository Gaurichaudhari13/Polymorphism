package com.jsp.polymorphism;

public class Driver {

	public static void main(String[] args) {
		Father father = new Father();
		father.buy();
		Father father2 = new Son();
		father2.buy();
		Son son = new Son();
		son.buy();
	}

}
