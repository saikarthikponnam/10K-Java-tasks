package com.functionalinterface;

public class Example4 {

	public static void main(String[] args) {
		CheckPrime c = new CheckPrime() {
			@Override
			public boolean checkNumber(int n) {
				
				if(n <= 1) return false;
				for(int i=2; i<=n / 2; i++) {
					if(n % i == 0) return false;
				}
				return true;
			}
		};
		int n = 14;
		if(c.checkNumber(n)) System.out.println(n + " is prime number");
		else System.out.println(n + " is not prime number");
		CharCheck charCheck = new CharCheck() {
			@Override
			public void checkChar(Character c) {
				int ascii = (int) c;
				boolean isPrime=true;
				if(ascii <= 1) {
					isPrime = false;
				}
				for(int i=2; i<=ascii / 2; i++) {
					if(ascii % i == 0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime Number");
		}
			}
			};
	charCheck.checkChar('A');
	}
	}