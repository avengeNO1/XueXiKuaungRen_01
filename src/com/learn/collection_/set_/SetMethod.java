package com.learn.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("jack");
        set.add("mary");
        set.add("john");
        set.add("jack");
        set.add("mary");
        set.add(null);
        set.add(null);
        System.out.println("set = " + set);
        //遍历
        System.out.println("=====使用迭代器===");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
        System.out.println("===使用增强for===");
        for (Object o :set) {
            System.out.println("o = " + o);
        }

    }
}

   