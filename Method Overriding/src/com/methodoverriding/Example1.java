package com.methodoverriding;

class Animal{
	public void makeSound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
		Animal dog = new Dog();
		dog.makeSound();
	}

}
