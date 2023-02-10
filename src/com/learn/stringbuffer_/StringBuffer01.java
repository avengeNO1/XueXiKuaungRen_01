package com.learn.stringbuffer_;

/**
 * @author HuAng
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        /*
            1.StringBuffer 的直接父类是AbstractStringBuilder
            2.实现了Serializable,即StringBuffer 的对象可以串行化
            3.在父类中 AbstractStringBuilder 有属性char[] value,不是final
              该 value 数组存放 字符串内容 引出存放在堆中的
            4.StringBuffer是一个final类 不能被继承
            5.因为StringBuffer 字符内容是存在 char[] value 所以在变化(增加/删除)
              不用每次都更换地址（即不是每次都创建对象）效率高
         */
        StringBuffer stringBuffer = new StringBuffer();
    }
}

   