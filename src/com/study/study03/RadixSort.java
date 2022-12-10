package com.study.study03;
/**
 * 基数排序 （桶排序）
 * */
public class RadixSort {
    public static void radixSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        radixSort(arr, 0, arr.length - 1, maxbits(arr));
    }

    private static void radixSort(int[] arr, int begin, int end, int digit) {
        final int radix = 10;//定义十个"桶"
        int i = 0, j = 0;
        int[] bucket = new int[end - begin + 1];//基数（桶）排序可以对任意子数组排序
        for (int d = 1; d <= digit; d++) {//（几位数就排几次）
            int[] count = new int[radix];
            for (i = begin; i <= end; i++) {
                j = getDigit(arr[i], d);
                count[j]++;
            }
        }
    }                                                           //pow(a,b) a的b次方
    public static int getDigit(int x, int d) {
        return ((x / ((int) Math.pow(10, d - 1))) % 10);
    }
    //找出最大数是几位数（几位数就排几次）
    private static int maxbits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }
        int res = 0;
        while (max != 0){
            res++;
            max /= 10;
        }
        return res;
    }
}
