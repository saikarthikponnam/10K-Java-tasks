package com.functionalinterface;

interface CheckPrime{
	boolean checkNumber(int n);
}

public class Example1 {

	public static void main(String[] args) {

		CheckPrime c = new CheckPrime() {
			@Override
			public boolean checkNumber(int n) {
				
				if(n <= 1) {
					return false;
				}
				for(int i=2; i<=n / 2; i++) {
					if(n % i == 0) {
						return false;
					}
				}
				return true;
			}
		};
		int n = 14;
		if(c.checkNumber(n)) {
			System.out.println(n + " is prime number");
		}else {
			System.out.println(n + " is not prime number");
		}
	}

}
