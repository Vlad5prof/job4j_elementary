package ru.job4j.condition;

public class RectangleArea {
        public static double square(double p, double k) {
            double h = p / (2 * (k + 1));
            double l = h * k;
            return l * h;
        }

        public static void main(String[] args) {
            double result = square(4, 3);
            System.out.println(" p = 4, k = 3, s = 0, real = " + result);
            result = square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result);
            result = square(7, 2);
            System.out.println(" p = 7, k = 2, s = 2.72, real = " + result);
        }
    }