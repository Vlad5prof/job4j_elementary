package ru.job4j.calculator;

public class MathFunction {

    public static int func(int x) {
        int y = x * x + 3;
        System.out.println(y);
        return y;
    }

    public static int func2(int x) {
        int y = 20 / x;
        System.out.println(y);
        return y;
    }

    public static void main(String[] args) {
        int result = MathFunction.func(100);
        int result2 = MathFunction.func2(5);
        int result3 = result + result2;
        System.out.println(result3);
    }
}