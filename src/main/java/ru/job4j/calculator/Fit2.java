package ru.job4j.calculator;

public class Fit2 {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
       // return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
       /* double result = (height - 110) * 1.15;
        return result;*/
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit2.manWeight(height);
        System.out.println("Man 180 is " + man);
        height = 170;
        double woman = Fit2.womanWeight(height);
        System.out.println("Woman 170 is " + woman);
    }
}