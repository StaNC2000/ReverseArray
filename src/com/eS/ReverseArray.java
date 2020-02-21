package com.eS;

import java.util.Arrays;

public class ReverseArray {

    int[] reverse;

    public int[] reverseArray(int[] array) {
        reverse = new int[array.length];
        System.out.println("Entered array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            reverse[array.length - 1 - i] = array[i];
        }
        System.out.println("" +
                "Reversed array: " + Arrays.toString(reverse));

        return reverse;
    }
}
