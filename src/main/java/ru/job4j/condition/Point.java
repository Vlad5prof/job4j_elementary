package ru.job4j.condition;

public class Point {
    public static double distance(int x, int y, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = distance(2, 3, -4, -5);
        System.out.println("result (2, 3) to (-4, -5) " + result);
        result = distance(3, 2, 9, 7);
        System.out.println("result (3, 2) to (9, 7) " + result);
    }
}
