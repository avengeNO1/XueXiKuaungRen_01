package com.learn.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author HuAng
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 24, 54, 57, 99};
        //binarySearch 通过二分搜索进行查找，要求必须是有序的
        /*
         1.使用binarySearcher二叉查找
         2.必须是有序的，如果无序的数组不能使用binarySearch
        3.如果没有这个数据 源码  return -(low + 1);  // key not found.
        例如 查找4这个数 则返回-3 解读 如果4这个数 应该在3后面 位置（lower）为 2
         */
        int i = Arrays.binarySearch(arr, 3);
        System.out.println(i);

        //copyOf 数组元素的复制
        /*
            1.从arr数组中 拷贝arr.length个元素到 newArr数组中
            2.如果拷贝的长度 > arr.length 就在新数组的后面增加 null
                Integer[] newArr = Arrays.copyOf(arr, arr.length + 1);
                [1, 3, 24, 54, 57, 99, null]
            3.如果拷贝的长度  < 0,则返回异常NegativeArraySizeException

         */

        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("拷贝后的数组");
        System.out.println("newArr = " + Arrays.toString(newArr));

        //fill 数组填充
        /*
          使用99 替换掉原来的数组元素
         */
        Integer[] num = new Integer[]{1, 2, 3};
        Arrays.fill(num, 99);
        System.out.println("填充结果\t" + Arrays.toString(num));

        //equals 比较两个数组是否完全一致
        //完全一致则返回true 否则false
        Integer[] arr1 = {1, 3, 24, 54, 57, 99};
        boolean equals = Arrays.equals(arr, arr1);
        System.out.println("比较结果\t" + equals);

        //asList 将一组数组转换成list
        //asList 将数组元素转换成list集合
        /*
             返回的 asList 编译类型是List(接口)
             asList的运行类型是 java.util.Arrays$ArrayList 是Arrays 类里面的静态内部类
         */
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 6);
        System.out.println("转换后的结果" + integers);

    }
}

   