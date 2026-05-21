package com.arrays1;

public class Example1 {

	public static void main(String[] args) {
		int[] arr1 = UtilityClass.arrays();
		int sum = 0;
		for(int a : arr1) {
			sum = sum + a;
		}
		System.out.println("Sum of array elements = " + sum);
	}

}
