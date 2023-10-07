package com.jsp.polymorphism;

public class Variable_Shadowing {
	int id = 10;
	String name = "xyz";

	public static void main(String[] args) {
		int id = 20;
		String name = "abc";
		System.out.println(id);
		System.out.println(name);

	}

}
