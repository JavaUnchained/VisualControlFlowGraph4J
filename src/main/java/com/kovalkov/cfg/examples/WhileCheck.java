package com.kovalkov.cfg.examples;

public class WhileCheck {
    private static int someWhile() {
        int i = 100;
        int c = 0;
        while (i > 0) {
            c = c + i;
            i--;
        }
        return c;
    }
}
