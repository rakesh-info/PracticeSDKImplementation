package com.practice.mathematics;

public class Math {
    public static int appIntegers(int... args) {
        int result = 0;
        if (args.length > 0) {
            for (int arg : args) {
                result += arg;
            }
        }
        return result;
    }
}
