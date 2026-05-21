package com.methodoverriding;

class Vehicle{
	public void start() {
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car started");
	}
}

public class Example2 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.start();
		Vehicle v2 = new Car();
		v2.start();
	}

}
