package com.learn.stringbuffer_;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String commodity = scanner.next();
        System.out.println("请输入商品的价格：");
        String price = scanner.next();
        System.out.print("书本\t价格"+"\n"+ commodity + "\t");
        StringBuffer stringBuffer = new StringBuffer(price);
//        int i = stringBuffer.lastIndexOf(".");
//        stringBuffer = stringBuffer.insert(i - 3, ",");
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i , ",");
        }
        System.out.println(stringBuffer);

    }
}
   