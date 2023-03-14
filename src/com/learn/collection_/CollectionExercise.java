package com.learn.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
 * @author HuAng
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List coll = new ArrayList();
        coll.add(new Dog("旺财", 2));
        coll.add(new Dog("mary", 1));
        coll.add(new Dog("那里痛", 4));

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);
        }
        System.out.println("=============");
        Iterator iterator1 = coll.iterator();
        for (Object dog : coll){
            System.out.println("dog = " + dog);
        }
    }
}
class Dog{
    private String name;
    private  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
   