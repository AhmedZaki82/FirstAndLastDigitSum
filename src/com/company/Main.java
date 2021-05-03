package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-1));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number >= 0 && number < 10) {
            System.out.println("The number has to be greater than 10");
            return -1;
        } else if (number < 0) {

            System.out.println("You can't use negative numbers.");
            return -1;
        }

        int last = number % 10;
        int first = 0;

        while (number > 0) {
            first = number;
            number /= 10;
        }

        return first + last;
    }
}
