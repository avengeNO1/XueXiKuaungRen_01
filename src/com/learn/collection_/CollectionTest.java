package com.learn.collection_;

import java.util.ArrayList;

/**
 * @author HuAng
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book01("JJ", 122, "JACK"));
        list.add(new Book01("kk", 12, "mary"));
        list.add(new Book01("cc", 12.22, "milan"));
        sort(list);
        System.out.println("冒泡排序后");
        for (Object o :list) {
            System.out.println("o " + o  );
        }

    }

    public static void sort(ArrayList list) {//冒泡
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book01 o1 = (Book01)list.get(j);
                Book01 o2 = (Book01)list.get(j + 1);
                if (o1.getPrice() > o2.getPrice()){
                    list.set(j,o2);
                    list.set(j + 1,o1);
                }
            }
        }

    }
}

class Book01 {
    private String name;
    private double price;
    private String author;

    public Book01(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book01{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

   