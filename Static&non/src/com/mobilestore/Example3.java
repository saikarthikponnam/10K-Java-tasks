package com.mobilestore;

class Mobile {
    static String storeName;
    String brand;
    int price;

    void showDetails() {
        System.out.println("Store Name : " + storeName);
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile Price : " + price);
        System.out.println("-------------------------");
    }
}

public class Example3 {

	public static void main(String[] args) {
		Mobile.storeName = "Tech World";

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1200;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 900;

        m1.showDetails();
        m2.showDetails();
	}

}
