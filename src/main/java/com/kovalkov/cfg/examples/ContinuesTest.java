package com.kovalkov.cfg.examples;

public class ContinuesTest {
    public void continueMethod() {
        int c = 0;
        int b = 1;
        c = b + 100;
        for (int i = 0; i < 200 ; i++) {
            if (c > 20) {
                c += 2;
                System.out.println(c);
                continue;
            } else {
                c -= 1;
                System.out.println(c);
            }
            b = c + 5;
            System.out.println(c + b);
        }
        System.out.println(b);
    }
}
