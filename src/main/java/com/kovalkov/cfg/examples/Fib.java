package com.kovalkov.cfg.examples;

public class Fib {
    public static void main(String[] args){
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){
            n2=n0+n1;
            if (n1 > 150) {
                continue;
            }
            System.out.print(n2);
            if (n2 > 200) {
                break;
            } else {
                n0 = n1 + 100;
            }
            n0=n1++;
            n1=n2++;
        }
        System.out.println("end program");
        n0 = n1 + n2;
        System.out.println("Any output" + n0);

    }
}
