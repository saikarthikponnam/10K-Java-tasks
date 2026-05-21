package com.arrays1;

public class Example2 {

	public static void main(String[] args) {
		int[] arr2 = UtilityClass.arrays();
		int evenCount = 0;
		int oddCount = 0;
		for(int i : arr2) {
			if(i % 2 == 0) {
				evenCount += 1;
			}else oddCount += 1;
		}
		System.out.println("Even count = " + evenCount);
		System.out.println("Odd count = " + oddCount);
	}
}
