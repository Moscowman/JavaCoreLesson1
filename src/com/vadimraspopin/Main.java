package com.vadimraspopin;

public class Main {

    public static void main(String[] args) {
        byte byteVar = -100;
        short shortVar = 10000;
        int intVar = -1493459344;
        long longVar = 3769457698476947556L;
        float floatVar = 6.233453534f;
        double doubleVar = 1.5837964876894759827492795349679363;
        char charVar = 'a';
        String stringVar = "This is a string";
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("string: " + stringVar);
        int intCalculated = calculation(1, 2, 3, 4);
        System.out.println("calculated: " + intCalculated);
        System.out.println("3 + 14 в диапазоне от 10 до 20: " + isSumBetween10and20(3, 14));
        System.out.println("-30 + 7 в диапазоне от 10 до 20: " + isSumBetween10and20(-30, 7));
        printlnIsPositive(-6);
        System.out.println(isNegative(8));
        printHelloName("Вадим");
        printIsYearLeap(2020);
        printIsYearLeap(2021);
        printIsYearLeap(2100);

    }

    private static int calculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean isSumBetween10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void printlnIsPositive(int number) {
        System.out.println(number >= 0);
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void printHelloName(String name) {
        System.out.printf("Привет, %s\n", name);
    }

    private static void printIsYearLeap(int year) {
        if (year % 400 == 0) {
            System.out.printf("Год %d високосный\n", year);
        } else if (year % 100 == 0) {
            System.out.printf("Год %d не високосный\n", year);
        } else if (year % 4 == 0) {
            System.out.printf("Год %d високосный\n", year);
        } else {
            System.out.printf("Год %d не високосный\n", year);
        }

    }
}
