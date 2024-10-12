package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {

        boolean prime = number > 1;
        for (int index = 2; index < number; index++) {
            int hold = number % index;
            if (hold == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}