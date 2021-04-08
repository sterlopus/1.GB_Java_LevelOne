package ru.geekbrains.java_level_one.lession1;

import static java.lang.System.*;

public class FirstClass {

    public static void main(String[] args) {
        // write your code here
        printThreeWords();
    }

    private static void printThreeWords() {
//      System.out.println("Orange\nBanana\nApple");
        System.out.println("Orange" + System.lineSeparator() + "Banana" + System.lineSeparator() + "Apple");
    }
}
