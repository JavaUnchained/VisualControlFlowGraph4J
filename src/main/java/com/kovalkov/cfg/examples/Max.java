package com.kovalkov.cfg.examples;

public class Max {
    public static int max(int[] array) {
        int maximum = array[0];
        int[] arr = array;
        for (int i = 0; i < arr.length; i++) {
            int compare = arr[i];
            if (maximum < compare){
                maximum = compare;
            }
        }
        return maximum;
    }
}
