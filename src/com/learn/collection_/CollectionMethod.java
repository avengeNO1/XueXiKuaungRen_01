package com.learn.collection_;

import java.util.ArrayList;

import java.util.List;

/**
 * @author HuAng
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("小龙女");
        list.add(20);
        list.add(true);
        System.out.println("list = " + list);

//        list.remove(1); //删除的是第二个元素
        list.remove("小龙女");
        System.out.println("list = " + list);

        System.out.println(list.contains("小龙女"));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        list.clear();//清空
        System.out.println("list = " + list);

        ArrayList list2 = new ArrayList();
        list2.add("java 从入门到精通");
        list2.add("php 从入门到精通");
        list2.add("c 从入门到精通");
        list.addAll(list2);
        System.out.println("list = " + list);

        System.out.println(list.containsAll(list2));

        list.removeAll(list2);
        System.out.println("list = " + list);


    }
}

   