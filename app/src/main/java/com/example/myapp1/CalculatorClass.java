package com.example.myapp1;

public class CalculatorClass {

    int num1, num2;
    String op;
    public double calculate(double n1, double n2, String op) {
        double result = 0;
        switch (op) {
            case "+":
                result = n1 + n2;
                break;

            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;

            case "/":
                result = n1 / n2;
                break;
        }
        return result;
    }
}

