package com.abstraction;

abstract class Payment{
	abstract void processPayment();
	abstract void validateTransaction();
	void generateTransactionId() {
		int transactionId = (int)(Math.random() * 1000000000);
        System.out.println("Generated transaction ID: " + transactionId);
	}
}
class CreditCardPayment extends Payment{
	String cardNumber;
	String expiryDate;
	String cvv;
	public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	@Override
	void processPayment() {
		System.out.println("Processing credit card payment.");
	}
	@Override
	void validateTransaction() {
		System.out.println("Validating card number, expiry, and CVV.");
	}
}
class UPIPayment extends Payment {

    String upiId;
    String phoneNumber;

    UPIPayment(String upiId, String phoneNumber) {
        this.upiId = upiId;
        this.phoneNumber = phoneNumber;
    }

    void processPayment() {
        System.out.println("Processing UPI payment.");
    }

    void validateTransaction() {
        System.out.println("Validating UPI ID and phone number.");
    }
}
class PayPalPayment extends Payment {

    String email;
    String authToken;

    PayPalPayment(String email, String authToken) {
        this.email = email;
        this.authToken = authToken;
    }

    void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

    void validateTransaction() {
        System.out.println("Validating email and authentication token.");
    }
}

public class Example2 {

	public static void main(String[] args) {
		 Payment p1 = new CreditCardPayment("1234567890123456", "12/25", "123");
	        p1.processPayment();
	        p1.validateTransaction();
	        p1.generateTransactionId();

	        System.out.println();

	        Payment p2 = new UPIPayment("user@upi", "1234567890");
	        p2.processPayment();
	        p2.validateTransaction();
	        p2.generateTransactionId();

	        System.out.println();

	        Payment p3 = new PayPalPayment("user@example.com", "abc123");
	        p3.processPayment();
	        p3.validateTransaction();
	        p3.generateTransactionId();
	}
}
