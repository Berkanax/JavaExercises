package com.sda.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'a';
        int result = countCharecters(input, searchedCharacter);
        System.out.println(result);
    }

    private static int countCharecters(String input, char searchedCharacter){
        int counter = 0;
        if(StringValidator.isValid(input)) {
            /*
            Ala ma kota
            a
             */
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == searchedCharacter){
                    counter++;
                }
            }
        }
        return counter;
    }
}
