package com.wyk.工具类;

import com.wyk.选择排序法.SelectionSort;

import java.lang.ref.SoftReference;

//判断是否有序
public class SmallSort {



    private SmallSort() {
    }

    public static <E extends Comparable<E>> boolean isOrderly(E[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static  <E extends Comparable<E>> void testSort(String nameSort,E [] arr){
        long start = System.nanoTime();
        if ("SelectionSort".equals(nameSort)){
            SelectionSort.sort1(arr);
        }
        long end = System.nanoTime();
        double times = (end - start) / 1000000000.0;
        if (!SmallSort.isOrderly(arr)){
            throw new RuntimeException("不是有序");
        }
        System.out.println(String.format("%s , n = %d : %f s ",nameSort,arr.length,times));
    }


}
