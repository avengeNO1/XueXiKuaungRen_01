package com.learn.collection_.list_;

import java.util.LinkedList;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class LinkedListExercise {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);
        for (Object o : linkedList) {
            System.out.println(o);
        }
//        linkedList.remove(0);//默认删除的是第一个节点
//        linkedList.remove(kk);//删除指定的节点
        linkedList.set(0, "Hello java");
        System.out.println("===");
        for (Object o : linkedList) {
            System.out.println(o);
        }
        Object o = linkedList.get(0);
        System.out.println("o = " + o);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}

   