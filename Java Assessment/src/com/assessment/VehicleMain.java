package com.assessment;
import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String ownerName = sc.nextLine();
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber = sc.nextLine();
		System.out.println("Enter Vehicle Type:");
		String vehicleType = sc.nextLine();
		System.out.println("Enter Service Center Name:");
		String centerName = sc.nextLine();
		System.out.println("Enter Service Category:");
		String serviceCategory = sc.nextLine();
		System.out.println();
		Vehicle v = new ServiceVehicle(ownerName, vehicleNumber, vehicleType, centerName, serviceCategory);
		int input;
		do {
		System.out.println("Menu");
		System.out.println();
		System.out.println("--- Vehicle Service Menu ---");
		System.out.println("1. Update Service Category");
		System.out.println("2. Update Service Center");
		System.out.println("3. View Profile");
		System.out.println("4. Exit");
		System.out.println("Enter choice");
		input = sc.nextInt();
		sc.nextLine();
		switch(input) {
			case 1: 
				System.out.println("Enter new Service :");
				String newCategory = sc.nextLine();
				((ServiceVehicle) v).updateServiceCategory(newCategory);break;
			case 2: 
				System.out.println("Enter new Center :");
				String newCenter = sc.nextLine();
				((ServiceVehicle) v).updateServiceCenter(newCenter); break;
			case 3: v.displayProfile();break;
			case 4: System.out.println("Exit");break;
			default: System.out.println("Enter Valid input");
		}
		}while(input != 4);
}
}
