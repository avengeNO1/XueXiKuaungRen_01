package com.learn.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author HuAng
 */
public class ThrowsDetail {
    public static void main(String[] args) {

    }
    //加餐
    public static void f1() throws FileNotFoundException {
        //正常情况下直接调用f2方法是可以的
        //但是 因为f2方法抛出的是一个编译异常
        //此时f1方法必须要处理这个异常  try-catch/throws
        f2();//抛出异常
    }
    public static void f2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D://aa.tet");

    }

    public static void f3(){
        //不报错
        //因为f4抛出的是运行异常 会有默认的throws，所以不会报异常
        f4();
    }
    public static void f4() throws ArithmeticException{

    }
}


class Father{//父类
    public void method() throws RuntimeException{
    }
}
class Son extends Father{//子类
    //3子类重写父类的方法时 抛出异常为父类的相同异常类型或父类异常类型
    //的子类类型

    @Override
    public void method() throws RuntimeException {
        super.method();
    }
}
   