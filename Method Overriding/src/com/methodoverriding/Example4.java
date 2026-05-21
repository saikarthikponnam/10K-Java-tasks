package com.methodoverriding;

class Parent{
	static void print() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	static void print() {
		System.out.println("Child");
	}
}

public class Example4 {

	public static void main(String[] args) {
		Parent.print();
		Child.print();
	}

}
