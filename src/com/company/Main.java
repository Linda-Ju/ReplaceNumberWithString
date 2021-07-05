package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //HOMEWORK 1st solution ()
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 7 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//      2nd solution    CONTINUE - jumps to the next iteration or repetition
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 7 == 0) {
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }





            // write a program to calculate the x values of a quadratic equation
            // (-b+- sqrt(b^2-4*a*c)) / 2a
            // 2x^2 + 3x - 4 = 0
            // a      b    c

            // 1. Collect input
            // 2. Solve for the discriminant
            // 3. Find the 1st x value (negative)
            // 4. Find the 2nd x value (positive)
            // 5. Output the result

            // Get user input from the console
            // initialize the scanner.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the value  of a: ");
//        double a = scanner.nextDouble();
//
//        System.out.print("Enter the value  of b: ");
//        double b = scanner.nextDouble();
//
//        System.out.print("Enter the value  of c: ");
//        double c = scanner.nextDouble();
//
//        //solve for the discriminant - (b^2 - 4 * a * c)  -- PEMDAS
//        double discriminant = Math.pow(b, 2) - (4 * a * c);
//
//        // if the discriminant is negative then exit the program;
//        if (discriminant < 0) {
//            System.out.println("Discriminant is negative");
//            return;
//        }
//
//        // solve for the 1st value of x
//        // (-b + sqrt(discriminant)) / 2 * a
//        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
//
//        // solve for the 2nd value of x
//        // (-b + sqrt(discriminant)) / 2 * a
//        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;
//
//        // output the results
//        System.out.println("the 1st value of x " + x1);
//        System.out.println("the 2nd value of x " + x2);







        // write a program that takes a number n and calculates harmonic series from 1-n
        // e.g. n=5
        // enter the value of n: 5
        // harmonic series formula: 1 + 1/2 + 1/3 + 1/4 ... + 1/n
        // the answer is : ...

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a value for n: ");
//        double n = scanner.nextInt();
//        double result = 0;
//        while (n > 0){
//            result = result + 1/n;
//            n--;
//            System.out.println("result = " + result);
//        }

//        for (double i = 1; i <= n; i++){
//            result = result + 1/i;
//            System.out.println("result = " + result);
//        }






        // write a program that takes in the value of 8 kids
        // ages in the array
        // and finds the average

        // 1. initialize scanner
        // 2. get the size of the array
        // 3. create an array of that size
        // 4. add the user's values to the array
        // 5. loop through and find the sum of the values
        // 6. divide by the length

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of values you want to average: ");
//        // get the size of the array, and create the array of that size
//        int[] kidsAges = new int[scanner.nextInt()];
//
//        // add users values of the array
//        for (int i = 0; i < kidsAges.length; i++) {
//            System.out.print("Enter the next age: ");
//            kidsAges[i] = scanner.nextInt();
//        }
//
//        // get the sum of the values
//        double sum = 0;
//        for (int i = 0; i < kidsAges.length; i++){
//        sum += kidsAges[i];
//        }
//        System.out.println("The average of the " + kidsAges.length + " kids is: " + sum/ kidsAges.length);


        // Write a program that takes a set of values as an array
        //print out the values as a string like [3, 5, 4, 2, 1]

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");

        int[] numbers = new int[scanner.nextInt()];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the next number: ");
            numbers[i] = scanner.nextInt();
        }
        // 1st solution:
//        System.out.print(Arrays.toString(numbers));


        // 2nd solution:
        String numbersArray = "[";
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                numbersArray += numbers[i] + ", ";
            } else {
                numbersArray += numbers[i] + "]";
            }
        }
        System.out.println("numbers = " + numbersArray);
    }
}

