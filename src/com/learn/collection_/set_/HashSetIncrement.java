package com.learn.collection_.set_;

import java.util.HashSet;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for (int i = 1; i <= 100; i++){
//            hashSet.add(i);
//        }


//        for (int i = 1; i <= 12; i++) {
//            hashSet.add(new A(i));
//        }
//        System.out.println("hashset = " + hashSet);
        /*
        当向hashset增加一个元素 Node 加入table 就算增加了一个
         */
        for (int i = 1; i <= 7; i++) {
            hashSet.add(new A(i));
        }
        for (int i = 1; i <=7 ; i++) {
            hashSet.add(new B(i));
        }
    }
}
class B {
    private int n;

    public B(int n) {
        this.n = n;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}
class A {
    private int n;

    public A(int n) {
        this.n = n;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}
   