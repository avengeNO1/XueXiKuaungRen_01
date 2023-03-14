package com.learn.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author HuAng
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection coll = new ArrayList();

        coll.add(new Book("三国演义", "罗贯中", 10.2));
        coll.add(new Book("水浒传", "施耐庵", 9.22));
        coll.add(new Book("红楼梦", "曹雪芹", 14.8));
        System.out.println("coll = " + coll);
        System.out.println("=====================");
        //遍历集合
        //  1 得到coll 对应的迭代器
        Iterator iterator = coll.iterator();
        // 2 判断是否有下一个元素
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //3 当退出while循环后，此时itertor迭代器指向最后的 元素
        // iterator.next();//NoSuchElementException
        //4 如果需要再次遍历 则重置即可
        iterator = coll.iterator();
        System.out.println("第二次遍历");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
   