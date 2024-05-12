package ru.job4j.condition;

public class RectangleArea {
        public static double square(double p, double k) {
            return Math.pow(p / (2 * (k + 1)), 2) * k;
        }

        public static void main(String[] args) {
            double result = square(4, 3);
            System.out.println(" p = 4, k = 3, s = 2, real = " + result);
            result = square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        }
    }
