package com.study.study02;

public class SmallSum {

    public static int smallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        return mergeWay(arr, 0, arr.length - 1);

    }

    private static int mergeWay(int[] arr, int l, int r) {
        if (l == r){
            return 0;
        }
        int mid = r + ((l-r) >> 1);
        return mergeWay(arr, l, mid) +//逐层返回，向上地递归
        mergeWay(arr, mid + 1, r) +
        merge(arr, l, mid, r);

    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= r){
            res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        for (i = 0; i < help.length; i++){
            arr[l + i] = help[i];
        }
        return res;
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
        System.out.println(smallSum(arr));
    }
}
