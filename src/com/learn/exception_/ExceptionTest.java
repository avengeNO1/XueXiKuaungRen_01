package com.learn.exception_;

/**
 * @author HuAng
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //1.NullPointerException
//        String name = null;
//        System.out.println(name.length());

        //2.ArithmeticException: / by zero
//        int n1 = 10;
//        int n2 = 0;
//        System.out.println(n1/n2);

        //3.ArrayIndexOutOfBoundsException: 3
//        int [] num = {1, 2, 3};
//        for (int i = 0; i <= num.length; i++) {// 0 1 2 3
//            System.out.println(num[i]);
//        }

        //4.ClassCastException
//        A a = new B();//向上转型
//        B b = (B) a;//向下转型
//        C c = (C) a;

        //5.NumberFormatException
        String title = "java学习狂人";
        //将String 转成 int
        int n1 = Integer.parseInt(title);
        System.out.println(n1);
    }
}
class A{}
class B extends A{}
class C extends A{}
   