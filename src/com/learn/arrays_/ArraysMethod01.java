package com.learn.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HuAng
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90};
        //遍历数组 传统
//        for (int i = 0; i <integers.length ; i++) {
//            System.out.println(integers[i]);
//        }
        //直接使用Arrays.toString方法，显示数组
        //    System.out.println(Arrays.toString(integers));

        //sort方法的使用
        Integer arr[] = {1, 2, -9, 0, 89};
        //进行排序
        //1.可以使用冒泡排序 或 Arrays.sort();
        //2.因为数组是引用类型，通过sort排序 会直接影响实参arr
        //3.sort重载 也可以通过传入一个接口 Comparator 实现定制排序
        //4.调用定制排序是 传入两个参数（1）排序的数组 arr
        //（2）实现了Comparator接口的匿名内部类 要求实现 compare方法
        //体现了接口编程的方式 看源码
        /*
             Arrays.sort(arr, new Comparator()
         */
        //自然排序
        //Arrays.sort(arr);//进行排序
        // System.out.println(Arrays.toString(arr));
        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;//i1 - i2 从小到大
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

