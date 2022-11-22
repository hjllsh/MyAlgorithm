package com.study.study02;

import java.util.PriorityQueue;

public class SmallHeapTree {
    /**
     * java自带了从小到大排序的堆
     * 可自定义排序规则
     * */
    public void createSmallHeapTree(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index < Math.min(arr.length ,k); index++) {//防止误操作，
            heap.add(arr[index]);
        }
        int i = 0;
        for (;index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()){
            arr[i++] = heap.poll();
        }
    }
}
