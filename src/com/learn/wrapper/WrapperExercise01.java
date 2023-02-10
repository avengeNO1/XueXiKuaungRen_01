package com.learn.wrapper;

/**
 * @author HuAng
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Object obj1 = true ? new Integer(1) : new Double(2.0);//三元运算符
        System.out.println(obj1);//1.0 将三元运算符看成一个整体 自动提升到 double类型

        Object obj2;
        if (true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);//1
    }
}

   