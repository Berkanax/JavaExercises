package com.sda.day2;

import java.nio.channels.FileLock;

public class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "ala";
        char result = getLastCharacter(input);
        System.out.println(result); //a

        input = "domek";
        result = getLastCharacter(input);
        System.out.println(result); //k

        input = "";
        result = getLastCharacter(input);
        System.out.println(result);

        input = "      ";
        result = getLastCharacter(input);
        System.out.println(result);

        input = null;
        result = getLastCharacter(input);
        System.out.println(result);
    }

    private static char getLastCharacter(String input) {
        /*
        input.equals("STOP") -> potencjalny NPE
        "STOP".equals(input) -> jesteśmy bezpieczni
        */
        if(StringValidator.isValid(input)){
            int lastPosition = input.length() - 1;
            //return input.substring(lastPosition);
            return input.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
