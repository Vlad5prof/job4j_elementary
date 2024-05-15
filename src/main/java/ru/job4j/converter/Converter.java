package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(490);
        System.out.println("490 rubles are " + euro + " euro");
        float dollars = rubleToDollar(300);
        System.out.println("300 rubles are " + dollars + " dollars");
    }
}