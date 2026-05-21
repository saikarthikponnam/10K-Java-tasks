package com.abstraction;
public class Demo {
public static void main(String[] args) {
try {
int a = 10, b = 0;
int result = a / b;
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero: " + e);
} finally {
System.out.println("Program ended.");
}
}
}
