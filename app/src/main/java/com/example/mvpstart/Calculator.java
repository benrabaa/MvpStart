package com.example.mvpstart;

public class Calculator {

    public int featureOne(String input) {
        if (!input.matches("[0-9]+")) {
            return 0;
        }

        int result = 0;
        int inputNumber = Integer.parseInt(input);
        result = inputNumber * 10 - 6 / 3 % 2;
        return result;
    }

    public int featureTwo(String input) {
        return 100;
    }
}
