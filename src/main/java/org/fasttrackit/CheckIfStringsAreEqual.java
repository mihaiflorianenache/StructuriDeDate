package org.fasttrackit;

import java.nio.CharBuffer;
import java.util.Scanner;

public class CheckIfStringsAreEqual {

    static void checkIfStringsAreEqual(StringBuilder builderOne, StringBuilder builderTwo) {
        String one = builderOne.substring(0, builderOne.length());
        StringBuffer bufferOne = new StringBuffer(one);

        String two = builderTwo.substring(0, builderTwo.length());
        StringBuffer bufferTwo = new StringBuffer(two);

        CharSequence charSequenceOne = bufferOne;
        CharSequence charSequenceTwo = bufferTwo;

        if (charSequenceOne.length() == charSequenceTwo.length()) {
            int i;
            for (i = 0; i < charSequenceOne.length(); i++) {
                if (charSequenceOne.charAt(i) != charSequenceTwo.charAt(i) && charSequenceOne.charAt(i) != charSequenceTwo.charAt(i) + 32 && charSequenceOne.charAt(i) != charSequenceTwo.charAt(i) - 32) {
                    System.out.println("Stringurile nu contin aceeasi informatie");
                    return;
                }
            }
            System.out.println("Stringurile contin aceeasi informatie");
        } else System.out.println("Stringurile nu contin aceeasi informatie");
    }

    static void checkEqualString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce string 1");
        String stringOne = scanner.nextLine();
        StringBuilder builderOne = new StringBuilder(stringOne.trim());

        System.out.println("Introduce string 2");
        String stringTwo = scanner.nextLine();
        StringBuilder builderTwo = new StringBuilder(stringTwo.trim());

        checkIfStringsAreEqual(builderOne, builderTwo);
    }

    public static void main(String[] args) {
        checkEqualString();
    }
}
