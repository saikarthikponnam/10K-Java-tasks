package com.functionalinterface;

interface CharCheck{
	void checkChar(Character c);
}

public class Example2 {

	public static void main(String[] args) {
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
