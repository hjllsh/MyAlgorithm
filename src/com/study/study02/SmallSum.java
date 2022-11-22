package com.study.study02;

public class SmallSum {

    public void smallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeWay(arr , 0, arr.length - 1);

    }

    private void mergeWay(int[] arr, int l, int r) {
        if (l == r){
            return;
        }
        int mid = r + ((l-r) >> 1);
        mergeWay(arr, l, mid);
        mergeWay(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private int merge(int[] arr, int l, int mid, int r) {
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
}
