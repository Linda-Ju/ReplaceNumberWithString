package com.company;

public class Main {

    public static void main(String[] args) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzbuzz = "FizzBuzz";
      int j = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
//                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
 //               System.out.println("FizzBuzz");
            }
        }
    }
}
