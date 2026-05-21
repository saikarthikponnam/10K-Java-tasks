package com.methodoverriding;

class Person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class Student extends Person{
	@Override
	public void display() {
		System.out.println("I am a student");
	}
}

public class Example3 {

	public static void main(String[] args) {
		Person p1 = new Student();
		p1.display();
	}	

}
