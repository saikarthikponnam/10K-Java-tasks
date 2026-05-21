package com.arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        int[] numbers1 = new int[3];
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;

        System.out.println("1. Integer array using for loop:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Alice";
        names[2] = "Bob";
        names[3] = "Emma";

        System.out.println("\n2. String array using foreach loop:");
        for (String name : names) {
            System.out.println(name);
        }

        double[] doubleValues = new double[3];
        doubleValues[0] = 10.5;
        doubleValues[1] = 20.75;
        doubleValues[2] = 30.25;

        System.out.println("\n3. Double array using for loop:");
        for (int i = 0; i < doubleValues.length; i++) {
            System.out.println(doubleValues[i]);
        }

        char[] characters = new char[5];
        characters[0] = 'A';
        characters[1] = 'B';
        characters[2] = 'C';
        characters[3] = 'D';
        characters[4] = 'E';

        System.out.println("\n4. Character array using foreach loop:");
        for (char ch : characters) {
            System.out.println(ch);
        }

        boolean[] boolValues = new boolean[2];
        boolValues[0] = true;
        boolValues[1] = false;

        System.out.println("\n5. Boolean array using for loop:");
        for (int i = 0; i < boolValues.length; i++) {
            System.out.println(boolValues[i]);
        }

        int[] numbers2 = new int[5];
        numbers2[0] = 5;
        numbers2[1] = 15;
        numbers2[2] = 25;
        numbers2[3] = 35;
        numbers2[4] = 45;

        System.out.println("\n6. Integer array using foreach loop:");
        for (int num : numbers2) {
            System.out.println(num);
        }

        String[] cities = new String[3];
        cities[0] = "Delhi";
        cities[1] = "Mumbai";
        cities[2] = "Chennai";

        System.out.println("\n7. City names using for loop:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        float[] floatValues = new float[4];
        floatValues[0] = 1.1f;
        floatValues[1] = 2.2f;
        floatValues[2] = 3.3f;
        floatValues[3] = 4.4f;

        System.out.println("\n8. Float array using foreach loop:");
        for (float value : floatValues) {
            System.out.println(value);
        }

        long[] longValues = new long[3];
        longValues[0] = 100000L;
        longValues[1] = 200000L;
        longValues[2] = 300000L;

        System.out.println("\n9. Long array using for loop:");
        for (int i = 0; i < longValues.length; i++) {
            System.out.println(longValues[i]);
        }

        short[] shortValues = new short[4];
        shortValues[0] = 100;
        shortValues[1] = 200;
        shortValues[2] = 300;
        shortValues[3] = 400;

        System.out.println("\n10. Short array using foreach loop:");
        for (short value : shortValues) {
            System.out.println(value);
        }
    }
}
