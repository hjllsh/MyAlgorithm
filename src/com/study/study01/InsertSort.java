package com.study.study01;

import com.study.study01.util.RandomArray;

/**
 * 插入排序 时间复杂度O(N*N)
 * */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i< arr.length; i++){

            for (int j = i-1; j >= 0; j--){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = RandomArray.creatRandomArray(10,100);
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
