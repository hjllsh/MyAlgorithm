package com.study.study01;
/**
 * 选择排序，时间复杂度O(N*N)
 * */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        for (int i =0; i< arr.length - 1; i++){
            int minIndex = i;
            for (int j= i+1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j :minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

        //位运行算交换 下标不可以相同 否则会为0
//        arr[i] = arr[i] ^ arr[minIndex];
//        arr[minIndex] = arr[i] ^ arr[minIndex];
//        arr[i] = arr[i] ^ arr[minIndex];
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
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
