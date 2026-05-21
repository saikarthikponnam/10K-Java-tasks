package com.arrays1;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		int[] arr4 = UtilityClass.arrays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int ele = sc.nextInt();
		for(int i=0; i<arr4.length; i++) {
			if(arr4[i] == ele) {
				System.out.println("Element found at position: " + (i+1));
			}
		}
	}

}
