package com.sda.day1;

public class Task6 {
    public static void main(String[] args) {
        printMultiplicationTableBasic();
        System.out.println();
        printMultiplicationTable(5, 1, 4);
        System.out.println();
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTableBasic() {
        for(int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        //#1 option
        for(int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }

        //#2 option
        /*for (; minMultiplicand <= maxMultiplicand; minMultiplicand++) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
        }*/

        //#3 option
        /*while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }*/

        //#4 option
        /*do {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        } while(minMultiplicand <= maxMultiplicand);*/
    }
}
}
