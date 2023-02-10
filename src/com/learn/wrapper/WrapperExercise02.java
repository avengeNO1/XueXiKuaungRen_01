package com.learn.wrapper;

/**
 * 面试题
 * @author HuAng
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        //分析结果是什么 并且给出理由
        //1 都是new 对象 两个不同
        Integer i = new Integer(1);
        Integer j = new Integer(2);
        System.out.println(i == j);//False

        //2
        //自动装箱 实质上 Integer.valueOf(1) 此时查看源码
        /*源码
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

         */
        //分析 从源码上可以知道 i 在介于某个范围时则直接返回 这个范围可以继续追源码 -128~127
        Integer n = 1;
        Integer m = 1;
        System.out.println(n == m);//True
    }
}

   