package com.learn.exception_;

import java.io.FileInputStream;

/**
 * @author HuAng
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws Exception {
        //创建一个文件流对象
        /*
        1.异常： FileNotFoundException
        2.可以使用 try -catch - finally解决
        3.throws 抛出异常，让调用f2方法的调用者（方法）处理
        4.throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        5.throws 关键字后也可以是 异常列表，即可以抛出多个异常 throws FileNotFoundException,NullPoINTEReXCEPTION

         */
        FileInputStream fis = new FileInputStream("D://aa.tet");
    }

}
