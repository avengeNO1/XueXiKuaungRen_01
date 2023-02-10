package com.learn.exception_;

/**
 * 自定义异常
 * @author HuAng
 */
public class CustomException {
    public static void main(String[] args) {
    //当接收Person对象年龄时，要求范围在18- 120之间，否则抛出一个自定义
    //异常（要求 继承RuntimeException），并给出提示信息。
        int age = 130;
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄要求范围在18- 120之间");
        }
        System.out.println("年龄在范围");
    }
}
//自定义异常AgeException
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
