package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 490;
        float expected = 7;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("490 rubles are 7 Test result : " + passed);
        input = 300;
        expected = 5;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("300 rubles are 5 Test result : " + passed);
    }
}