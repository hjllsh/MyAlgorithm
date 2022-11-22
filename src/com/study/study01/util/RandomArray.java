package com.study.study01.util;

public class RandomArray {
    public static int[] creatRandomArray(int length, int max){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++){
            arr[i] = (int) ((max + 1) * Math.random()) - (int) (max * Math.random());
        }
        return arr;
    }
}
