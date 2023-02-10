package com.learn.wrapper;

/**
 * @author HuAng
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示
        //手动
        int n = 10;
        Integer integer = new Integer(n);
        Integer integer1 = Integer.valueOf(n);

        int i = integer.intValue();

        //自动
        int n2 = 20;
        //自动装
        Integer integer2 = n2;//底层使用的是 Integer.valueOf(n2)
        //自动拆
        int n3 = integer2;
    }
}

   