package com.sda.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String input = "Ala ma, kota. a kot, ma Ale";
        String result = replaceInput(input);
        System.out.println(result);

        input = "fdsfsdfsd fsdfsdf";
        result = replaceInput(input);
        System.out.println(result);
    }

    private static String replaceInput(String input) {
        if(StringValidator.isValid(input)) {
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }
}
