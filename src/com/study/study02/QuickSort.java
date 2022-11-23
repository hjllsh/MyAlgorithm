package com.study.study02;


import com.study.study01.util.RandomArray;

/**
 * 快排3.0 用随机数使排序走不到最差情况，实现了 O( N*log(N) )
 * */
public class QuickSort {
    public static void quickSort(int[] arr){
    if (arr == null || arr.length < 2) {
        return;
    }
    quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r){
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
    int less = l - 1;
    int more = r;
    while (l < more) {
        if (arr[l] < arr[r]){
            swap(arr, ++less, l++);
        } else if (arr[l] > arr[r]) {
            swap(arr, --more, l);
        } else {
          l++;
        }
    }
    swap(arr, more, r);
    return new int[] {less + 1, more};
    }

    private static void swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = RandomArray.creatRandomArray(10, 10);
        quickSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
