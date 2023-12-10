package com.sda.day2;

public class Task2 {
    import com.example.utils.StringValidator;
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        boolean result = isCorrectPrefix(input, prefix);
        System.out.println(result); //true

        input = "java";
        prefix = "abc";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false

        input = "java";
        prefix = "abc";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false

        input = null;
        prefix = "abc";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false

        input = "java";
        prefix = null;
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false
    }

    private static boolean isCorrectPrefix(String input, String prefix) {
        if(isValid(input) && isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
