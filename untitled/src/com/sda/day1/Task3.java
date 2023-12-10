package com.sda.day1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        methodForPointA(firstDigit, secondDigit);
        methodForPointB(firstDigit, secondDigit);
        methodForPointC(firstDigit, secondDigit);
        methodForPointD(firstDigit, secondDigit);
    }

    private static void methodForPointA(int x, int y) {
        boolean result = x > y;
        System.out.println("If x is greater than y: " + result);
    }

    private static void methodForPointB(int x, int y) {
        boolean result = (x * 3) > y;
        System.out.println("If x*3 is greater than y: " + result);
    }

    private static void methodForPointC(int x, int y) {
        boolean result = (y++ < ++x) && (--x > y++);
        System.out.println("Result pointC: " + result);
    }

    private static void methodForPointD(int x, int y) {
        boolean result = (x * y) % 2 == 0;
        System.out.println("If x*y is even: " + result);
    }
}
