package com.sda.day1;

public class Task2 {
    //private static final float PI = 3.14F;
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        /*
        1. pobierz dane
        2. oblicz obwód
        3. oblicz pole
         */
        float radius = getDiameterFromUser() / 2;
        double calculatedCircumference = calculateCircumference(radius);
        double calculatedArea = calculateArea(radius);
        System.out.println("Circumference Of A Circle: " + calculatedCircumference);
        System.out.println("Area Of A Circle: " + calculatedArea);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static double calculateCircumference(float radius) {
        // 2 * pi * r
        return 2 * PI * radius;
    }

    private static double calculateArea(float radius) {
        // pi * r^2
        return PI * Math.pow(radius, 2);
    }
}
