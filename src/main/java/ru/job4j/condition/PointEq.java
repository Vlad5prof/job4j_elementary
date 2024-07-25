package ru.job4j.condition;

public class PointEq {
    public static boolean eq(int x1, int y1, int x2, int y2) {
        return (x1 == x2) && (y1 == y2);
    }

    public static void main(String[] args) {
        System.out.println(eq(0, 0, 2, 2));
        System.out.println(eq(20, 20, 20, 20));
        System.out.println(eq(30, 30, 30, 30));
    }
}