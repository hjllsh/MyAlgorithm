package com.study.study01;
// 在arr上，找满足>=value的最左位置
public class Dichotomy02 {
    public static int nearestIndex(int[] arr, int target) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        int mid = 0;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (arr[mid] >= target) {
                index = mid;
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
    return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 4;
        arr[5] = 4;
        arr[6] = 4;
        arr[7] = 4;
        arr[8] = 5;
        arr[9] = 5;
        System.out.println(nearestIndex(arr, 2));

    }

}
