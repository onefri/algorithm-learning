package com.wyk.线性查找法;


public class LinearSearch {
    private LinearSearch() {}

    public static <E> int data(E [] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
