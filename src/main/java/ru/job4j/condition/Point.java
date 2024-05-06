package ru.job4j.condition;

public class Point {
    public static double distance(int x, int y, int x2, int y2) {
        int resultMX = x2 - x;
        int resultMY = y2 - y;
        double resultP = Math.pow (resultMX, 2);
        double resultP2 = Math.pow (resultMY, 2);
        double resultS = resultP + resultP2;
        double result = Math.sqrt(resultS);
        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        distance(2, 2, 4, 4);
        System.out.println("result (2, 2) to (4, 4) " + result);
        distance(3, 3, 9, 9);
        System.out.println("result (3, 3) to (9, 9) " + result);
    }
}
