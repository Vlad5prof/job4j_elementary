package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(490);
        System.out.println("490 rubles are " + euro + " euro");
        float dollars = rubleToDollar(300);
        System.out.println("300 rubles are " + dollars + " dollars");
    }
}