package com.sda.day1;

import java.util.Scanner;

public class Task4 {
    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        1. pobierz wzrost
        2. pobierz wage
        3. oblicz bmi
        4. wyswietl wynik
         */
        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        double bmiResult = calculateBMI(height, weight);
        displayResult(bmiResult);
    }

    private static void displayResult(double bmi) {
        if(isInRange(bmi)) {
            System.out.println("BMI is correct: " + bmi);
        } else {
            System.out.println("BMI is not correct: " + bmi);
        }
    }

    private static boolean isInRange(double bmi) {
        return bmi >= BMI_MIN_RANGE && bmi <= BMI_MAX_RANGE;
    }

    private static double calculateBMI(int height, float weight) {
        // weight[kg] / height[m]^2
        float heightInMeter = height / 100F;
        return weight / Math.pow(heightInMeter, 2);
    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();
    }
}
