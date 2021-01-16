package com.kovalkov.cfg.examples;

public class ForWithBr {
    private static void forWithBrAndC() {
        int a = 100;
        int c = 0;
        for (int i = 0; i < a; i++) {
            c = c + 1;
            if (i % 10 == 0) {
               c = c + i;
               break;
            } else {
              a = 1;
            }
            c = c + (i / 2);
        }
    }
}
