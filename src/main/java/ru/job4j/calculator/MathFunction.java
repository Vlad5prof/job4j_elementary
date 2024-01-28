package ru.job4j.calculator;

public class MathFunction {

    public static int func1(int x) {
        int y = x * x + 1;
        System.out.println(y);
        return y;
    }

    public static int func2(int x) {
        int y = 10 / x;
        System.out.println(y);
        return y;
    }

    public static void main (String [] args) {
        int result1 = MathFunction.func1(100);
        int result2 = MathFunction.func2(5);
        int result3 = result1 + result2;
        System.out.println(result3);
    }
}

