package com.company.reverse.number;

public class NumberHelper {

    static int reverseNumber(int number) {
        String digits = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();

        for (int i = digits.length() - 1; i >= 0; i--) {
            reversed.append(digits.charAt(i));
        }
        return Integer.parseInt(reversed.toString());
    }
}
