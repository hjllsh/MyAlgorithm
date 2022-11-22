package com.study.study01;
/**
 * 二分查找某个数，前提是有序的数组
 * */
public class Dichotomy01 {
    public static boolean dichotomyExist(int[] arr, int target){
        if (arr == null || arr.length == 2){
            return false;
        }
        int L = 0;
        int R = arr.length - 1;//下标
        int mid = 0;
        while (L <= R){
            mid = L + ((R - L) >> 1);
            if (arr[mid] == target){
                return true;
            } else if (arr[mid] > target ) {
                R = mid - 1;
            } else if (arr[mid] < target) {
                L = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        System.out.println(dichotomyExist(arr, 1));

    }
}
