package com.arrays1;
import java.util.Scanner;

public interface UtilityClass {
	public static int[] arrays() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
