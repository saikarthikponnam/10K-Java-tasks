package com.abstraction;

abstract class Vehicle{
	String modelName;
	String vehicleNumber;
	String company;

	public Vehicle(String modelName, String vehicleNumber, String company) {
		super();
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}
	abstract void startEngine();
	void fuelType() {
		System.out.println("Petrol");
	}
}
class Car extends Vehicle{
	int numberOfDoors;
	boolean hasSunroof;
	public Car(String modelName, String vehicleNumber, String company, int numberOfDoors, boolean hasSunroof) {
		super(modelName, vehicleNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
}
class Bike extends Vehicle {
    boolean hasSidecar;

    Bike(String modelName, String vehicleNumber, String company, boolean hasSidecar) {
        super(modelName, vehicleNumber, company);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void startEngine() {
        System.out.println("Starting engine with kick-start.");
    }
}
class Truck extends Vehicle{
	int cargoCapacity;
	public Truck(String modelName, String vehicleNumber, String company, int cargoCapacity) {
		super(modelName, vehicleNumber, company);
		this.cargoCapacity=cargoCapacity;
	}
	@Override
	void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}
	public void fuelType() {
		System.out.println("Diesel");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Vehicle obj = new Car("Toyota Camry", "ABC123", "Toyota", 4, true);
		obj.startEngine();
		obj.fuelType();
		System.out.println();
		
		Vehicle obj1= new Bike("Yamaha R1", "XYZ789", "Yamaha", false);
		obj1.startEngine();
		obj1.fuelType();
		System.out.println();

		Vehicle obj2 = new Truck("Volvo FH", "DEF456", "Volvo", 20000);
		obj2.startEngine();
		obj2.fuelType();
		System.out.println();
	}

}
