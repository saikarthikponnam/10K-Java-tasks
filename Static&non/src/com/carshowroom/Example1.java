package com.carshowroom;

class Car {
    static String showroomName;
    String modelName;
    int price;

    void displayDetails() {
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Car Model : " + modelName);
        System.out.println("Car Price : " + price);
        System.out.println("-------------------------");
    }
}


public class Example1 {

	public static void main(String[] args) {
		Car.showroomName = "Elite Motors";

        Car c1 = new Car();
        c1.modelName = "Tesla Model S";
        c1.price = 80000;

        Car c2 = new Car();
        c2.modelName = "BMW X5";
        c2.price = 75000;

        c1.displayDetails();
        c2.displayDetails();
    }
}
