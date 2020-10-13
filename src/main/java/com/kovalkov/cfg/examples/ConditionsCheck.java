package com.kovalkov.cfg.examples;

public class ConditionsCheck {
    public static void two(int a, int b) {
        int c = a;
        int d = b;
        if (c == d) {
            d = c;
        }else{
            c = d;
        }
    }

    public static void light(int a, int b) {
        int c = a;
        int d = b;
        if (c == d) {
            c = d;
        }
    }
}
