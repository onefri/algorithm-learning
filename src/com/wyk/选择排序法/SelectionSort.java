package com.wyk.选择排序法;

import com.wyk.工具类.ArrayGenerator;
import com.wyk.工具类.SmallSort;

public class SelectionSort {
    private SelectionSort() {
    }

    //实现extends
    public static <E extends Comparable<E>> void sort1(E[] arr) {
        // arr[0...i) 是有序的；arr[i...n) 是无序的
        for (int i = 0; i < arr.length; i++) {

            // 选择 arr[i...n) 中的最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }

            swap(arr, i, minIndex);
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            int maxIndex = i;

            for (int j = i; j >= 0; j--) {
                if (arr[j].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }

    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

//        int [] data = {10000,100000};
//        for (int n : data) {
//            Integer[] arr = ArrayGenerator.RandomNumber(n, n);
//            SmallSort.testSort("SelectionSort",arr);
//        }

        Integer[] arr = {2, 1, 4, 3};
        SelectionSort.sort2(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
