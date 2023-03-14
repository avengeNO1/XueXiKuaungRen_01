package com.learn.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author HuAng
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Book("三国演义", "罗贯中", 10.2));
        coll.add(new Book("水浒传", "施耐庵", 9.22));
        coll.add(new Book("红楼梦", "曹雪芹", 14.8));

        //使用增强for循环
        for(Object book : coll){
            System.out.println("book = " + book);
        }
    }

}

   