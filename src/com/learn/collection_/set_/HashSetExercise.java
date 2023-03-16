package com.learn.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("tom",20));
        hashSet.add(new Employee("mary",24));
        hashSet.add(new Employee("tom",22));
        hashSet.add(new Employee("tom",20));
        System.out.println("hashset = " + hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
//如果 name 和age 相同则返回相同的hash值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

   