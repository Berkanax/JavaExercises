package com.sda.day2;

public class StringValidator {
    public static boolean isValid(String input) {
        return input != null && !input.isBlank();
    }
}
