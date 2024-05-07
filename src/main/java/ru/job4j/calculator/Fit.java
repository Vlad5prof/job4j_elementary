package ru.job4j.calculator;

public class Fit {
    public static double manWeight(int height) {
        double b;
               b = (height - 100) * 1.15;
        return b;
    }

    public static double womanWeight(int height) {
        double c;
               c = (height - 110) * 1.15;
        return c;
    }

    public static void main(String[] args) {
      double man = Fit.manWeight(187);
        System.out.println(man);
      double woman = Fit.womanWeight(170);
        System.out.println(woman);
    }
}