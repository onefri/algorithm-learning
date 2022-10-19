package com.wyk.工具类;

import java.util.Random;

public class ArrayGenerator {

    public static Integer[] generateOrderArray(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    //生成随机数
    public static  Integer []  RandomNumber(int n,int bound){
        Integer [] integer = new Integer [n];

        Random random = new Random();
        for (int i = 0; i < integer.length; i++) {

            integer [i] = random.nextInt(bound);
        }
        return integer;
    }
}
