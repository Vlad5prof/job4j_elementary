package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        System.out.println("Размер массива равен: " + names.length);
        names [0] = "Petr Arsentev";
        names [1] = "Ivanov";
        names [2] = "Petrov";
        names [3] = "Pavel Nikolaevich";
        System.out.println(names [0]);
        System.out.println(names [1]);
        System.out.println(names [2]);
        System.out.println(names [3]);
    }
}