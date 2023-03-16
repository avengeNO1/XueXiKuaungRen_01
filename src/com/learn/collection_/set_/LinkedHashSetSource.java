package com.learn.collection_.set_;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("HS");
        System.out.println("set = " + set);
        //显示 输出顺序与添加顺序保持一致
        /*
        2. LinkedHashSet 底层维护的是以恶搞LinkedHashMap(是HashMap的子类)
        3.LinkedHashSet底层结构（数组table+ 双向链表）
        4.添加第一次的时候 直接将数组table扩容到16 存放的结点类型是LinkedHashMap$Entry

         */
    }
}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public java.lang.String toString() {
        return "Customer{" +
                "name=" + name +
                ", no=" + no +
                '}';
    }
}
   