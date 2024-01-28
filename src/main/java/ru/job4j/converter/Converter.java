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

    public static float еuroToDollar(float value) {
        float result = value * 2.0f;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.9f;
        return result;
    }


    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(250);
        System.out.println("250 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollars + " dollars.");
        dollars = Converter.dollarToEuro(270);
        System.out.println("270 euro are " + dollars + " dollars.");
    }
}

