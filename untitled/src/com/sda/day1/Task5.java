package com.sda.day1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;

        int sum = sumOfSequence(firstDigit, secondDigit);
        System.out.println(sum);
    }

    private static int sumOfSequence(int firstDigit, int secondDigit) {
        /*
        x = 4
        y = 11
        sum = 4 + 5 + 6 + ... + 11
         */
        int result = 0;
//        for(int i = firstDigit; i <= secondDigit; i++) {
//            result += i;
//        }
//        for(;;){
//
//        }
//        for(; firstDigit <= secondDigit;) {
//            result += firstDigit;
//            firstDigit++;
//        }

//        while(firstDigit <= secondDigit) {
//            result += firstDigit;
//            firstDigit++;
//        }

        do {
            result += firstDigit;
            firstDigit++;
        } while(firstDigit <= secondDigit);

        return result;
    }
}
