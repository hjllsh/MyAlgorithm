package com.study.study02;
/**
 * 堆排序
 * */
public class HeapSort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++){
            heapInsert(arr, i);
        }
        int size = arr.length;
        swap(arr, 0,--size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }
    /**
     * 实现  大根堆
     * */
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {//如果当前节点的子节点大于父节点
            swap(arr, index, (index - 1) / 2);//交换节点的  值
            index = (index - 1) / 2;//让当前子节点作为父节点，接着寻找它的父节点
        }
    }
    /**
     *  实现 大根堆 的排序
     * */
    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;//左节点
        while (left < size) {//左节点 小于 排序长度
            //是否有左右节点,左右节点哪个大，把大的节点的索引给largest
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
//            把左右节点大的节点与父节点比较，把更大的节点下标给largest
            largest = arr[largest] > arr[index] ? largest : index;
            //如果largest 等于父节点 说明父节点是最大，当前仍然是 大堆树
            if (largest == index) {
                break;
            }
            //子节点的值大于父节点的值，值交换
            swap(arr, largest, index);
            //让交换前，大的子节点的下标作为父节点，因为交换之后，
            // largest是小的值，把它的索引给index作为父节点接着找它的子节点
            index = largest;
            //是否有左节点
            left = index * 2 + 1;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
