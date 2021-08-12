package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array1 = new int[] {2, 3, 4, 7, 8, 7, 7};
        System.out.println(Arrays.toString(StaticArray.reverse(array1)));

        System.out.println(Arrays.toString(StaticArray.createRandomArray(20,120)));

        System.out.println(StaticArray.appearanceCount(array1, 7));
    }
}
