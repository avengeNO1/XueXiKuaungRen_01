package com.learn.stringbuffer_;

/**
 * @author HuAng
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());//4

        System.out.println(stringBuffer);//null
//        StringBuffer stringBuffer1 = new StringBuffer(str);//NullPointerException
//        System.out.println(stringBuffer1);

    }
}

    