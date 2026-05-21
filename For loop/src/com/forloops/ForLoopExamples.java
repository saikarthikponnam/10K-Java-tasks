package com.forloops;

public class ForLoopExamples {
    public static void main(String[] args) {

        System.out.println("1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEven numbers (2 to 20):");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nOdd numbers (1 to 15):");
        for (int i = 1; i <= 15; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nMultiples of 5 (5 to 50):");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
    }
}
