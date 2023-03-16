package com.learn.collection_.set_;

import java.util.HashSet;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        //1.在执行add方法后会返回boolean值
        //2.添加成功 返回true 否则 false
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));

        set.remove("john");
        System.out.println("set = " + set);

        //5
        set = new HashSet();
        System.out.println("set = " + set);
        set.add("lucy");
        set.add("lucy");//加不进去
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set = " + set);

        //经典面试题
        //看源码分析
        set.add(new String("hsh"));//ok
        set.add(new String("hsh"));//加入不了
        System.out.println("set = " + set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

   