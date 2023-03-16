package com.learn.collection_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSetExercise01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee01("jack", 2000.2,new MyDate(2000,1,5)));
        hashSet.add(new Employee01("mary", 5000,new MyDate(1907,12,4))); 
        hashSet.add(new Employee01("mary", 7000,new MyDate(1907,12,4)));
        System.out.println("hashset = " + hashSet);
    }
}

class Employee01 {
    private String name;
    private double sal;
    private MyDate birthday;


    public Employee01(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 that = (Employee01) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
   