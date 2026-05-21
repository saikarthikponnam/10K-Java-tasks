package com.arrays1;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		int[] arr5 = UtilityClass.arrays();
		int[] arr = new int[arr5.length];
		for(int i=0; i<arr5.length; i++) {
			arr[i] = arr5[i];
		}
		 System.out.print("Elements copied to new array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}
}
