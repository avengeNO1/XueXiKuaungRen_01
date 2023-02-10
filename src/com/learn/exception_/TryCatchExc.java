package com.learn.exception_;

import java.util.Scanner;

/**
 * 课后题 ： 如果用户输入的不是一个整数，就提示重新输入，直到输入一个整数为止
 * @author HuAng
 */
public class TryCatchExc {
    public static void main(String[] args) {
        //思路
        /*
          创建scanner对象
          使用无限循环接收一个输入
          然后将该输入的值，转换成int
          如果抛出异常则说明不是一个可以转换成int的内容
          如果没有抛出异常则break
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {

            System.out.println("请输入整数");

            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数");
            }
        }
        System.out.println("num = " + num);
    }
}

   