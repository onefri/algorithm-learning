package com.wyk.线性查找法;

import com.wyk.工具类.ArrayGenerator;

public class Test {
    public static void main(String[] args) {
        int [] dataSize = {1000000,10000000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderArray(n);
            long start = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                LinearSearch.data(data,n);
            }
            long end = System.nanoTime();

            double v = (end - start) / 1000000000.0;
            System.out.println("运行100次"+  v);
        }


    }
}
