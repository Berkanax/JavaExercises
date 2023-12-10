package com.sda.day2;

public class Task3 {
import com.example.utils.StringValidator;
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        int result = getIndex(input, word);
        System.out.println(result);
    }

    private static int getIndex(String input, String word) {
        if(StringValidator.isValid(input) && StringValidator.isValid(word)) {
            //if(input.contains(word)) {
            return input.indexOf(word);
            //}
        }
        return -1;
    }
}
