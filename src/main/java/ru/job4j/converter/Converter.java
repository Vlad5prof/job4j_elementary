package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {

        float resultE = value / 70;
        return resultE;
    }

    public static float rubleToDollar(float value) {

        float resultD = value / 60;
        return resultD;
    }

    public static float euroToDollar(float value) {

        float resultED = value * 2.0f;
        return resultED;
    }

    public static float dollarToEuro(float value) {

        float resultDE = value * 0.9f;
        return resultDE;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(250);
        System.out.println("250 rubles are " + euro + " euro");
        float dollars = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollars + " dollars");
        dollars = Converter.dollarToEuro(270);
        System.out.println("270 euro are " + dollars + " dollars.");
        euro = Converter.dollarToEuro(300);
        System.out.println("300 dollars are " + euro + " euro");
    }
}