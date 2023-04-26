package com.example.javaproject2.wekk2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DefAndInitArr {
    public static void main(String[] args) {
        int[] iArr = new int[4];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        iArr[3] = 8;

        int[] iArr2 = new int[]{1, 2, 3, 8};

        int[] iArr3 = {1, 2, 3, 8};
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(iArr[1]);
        String[] strArr = new String[5];
        System.out.println(strArr[1]);
        System.out.println(Arrays.toString(strArr));
    }
}
