package com.learn.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author HuAng
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("jack" + i); //添加10个元素
        }
        System.out.println("list = " + list);
        System.out.println("--------在2号位置插入一个元素----------");
        list.add(1, "HSHVERYGOOD");

        System.out.println("list = "  + list);
        System.out.println("--------获得第5个元素----------");
        System.out.println("list = " + list.get(4));
        System.out.println("--------删除第6个元素----------");
        list.remove(5);
        System.out.println("list = " + list);
        System.out.println("--------修改第7个元素----------");
        list.set(6,"冲");
        System.out.println("list = " + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}

   