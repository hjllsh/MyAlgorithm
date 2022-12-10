package com.study.study03;
/**
 *   词频排序（只能 正数 或 0）
 * */
public class CountSort {
    //only for 0~200 values
    public static void countSort(int[] arr) {
    if (arr == null || arr.length < 2){
        return;
    }
    //定义一个最小的数
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
        max = Math.max(max, arr[i]);//找到原数组的最大值
    }
    int[] bucket = new int[max + 1];//创建一个辅助数组
    for (int i =0; i < arr.length; i++){
        bucket[arr[i]]++;//数组下标对应的值在辅助数组里不断++
    }
    int i = 0;
    for (int j = 0; j< bucket.length; j++) {
//        按顺序遍历数组里的值
        while (bucket[j]-- > 0) {
            arr[i++] = j;
        }
    }
    }


}
