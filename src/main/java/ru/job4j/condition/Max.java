package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(5, 2);
        System.out.println(result);
        result = Max.max(2, 7);
        System.out.println(result);
        result = Max.max(5, 5);
        System.out.println(result);
        result = Max.max(7, 7);
        System.out.println(result);
    }
}