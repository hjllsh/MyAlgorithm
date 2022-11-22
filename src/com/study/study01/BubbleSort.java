package com.study.study01;

/**
 * 冒泡排序 时间复杂度O(N*N)
 * */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length -1; e > 0; e--) {//次数
            for (int i =0; i < e; i++){
                if (arr[i] > arr[i + 1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 7;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = 6;
        arr[5] = 3;
        arr[6] = 3;
        arr[7] = 9;
        arr[8] = 5;
        arr[9] = 8;
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
