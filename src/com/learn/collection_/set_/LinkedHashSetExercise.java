package com.learn.collection_.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("奥托", 1000));
        set.add(new Car("奥迪", 120000));
        set.add(new Car("法拉利", 500000));
        set.add(new Car("奔驰", 192000));
        set.add(new Car("奥托", 1000));
        System.out.println("Car: " + set);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return
               "\n"+ "name='" + name + '\'' +
                        ", price=" + price +
                        '}';
    }
    //重写 equals和hashcode方法
    //当name 和price 相同时 就返回相同的hashCode值 equals 为true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
   