package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumMinusAndDiv(double first, double second) {
        return minus(first, second) + div(first, second);
    }

    public static double sumMultiplyAndMinusAndDiv(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + div(first, second);
    }

    public static void main(String[] args) {
       System.out.println("Результат расчета равен: " + sumAndMultiply(20, 30));
       System.out.println("Результат расчета равен: " + sumMinusAndDiv(50, 20));
       System.out.println("Результат расчета равен: " + sumMultiplyAndMinusAndDiv(70, 20));
    }
}