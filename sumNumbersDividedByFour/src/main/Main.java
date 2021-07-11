package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please give me a number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                total += number;
                System.out.println("Summation of numbers which can be divided by four for now: "
                                + total);
            }
            if (number % 4 != 0 && number % 2 == 0) {
                System.out.println("Summation of numbers which can be divided by four is not changed");
            }
            if (number % 2 != 0) {
                System.out.println("Please give an even number as an input next time");
            }

        } while (number % 2 == 0);
    }
}
