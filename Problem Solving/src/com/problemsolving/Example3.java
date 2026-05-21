package com.problemsolving;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        if (n <= 0) {
            System.out.println("Not Ugly Number");
            return;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }

        if (n == 1) {
            System.out.println(original + " is Ugly Number");
        } else {
            System.out.println(original + " is Not Ugly Number");
        }

    }
}