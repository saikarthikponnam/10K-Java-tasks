package com.arrays1;

public class Example3 {

	public static void main(String[] args) {
		int[] arr3 = UtilityClass.arrays();
		System.out.print("Array in reverse order: ");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + " ");
        }
	}
}
