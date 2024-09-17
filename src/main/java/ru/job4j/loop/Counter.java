package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
             if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 20));
        System.out.println(sum(3, 7));
        System.out.println(sum(3, 3));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(9, 59));
        System.out.println(sumByEven(7, 7));
        System.out.println(sumByEven(-2, 32));
    }
}