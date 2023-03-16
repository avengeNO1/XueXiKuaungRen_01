package com.learn.collection_.list_;

import java.util.*;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})

public class ListExercise02 {

    public static void main(String[] args) {
        // List list = new ArrayList();
        // List list = new LinkedList();
        List list = new Vector();
        list.add(new Book("红楼梦", 80.29, "曹雪芹"));
        list.add(new Book("西游记", 33.34, "吴承恩"));
        list.add(new Book("水浒传", 28.43, "施耐庵"));
        for (Object o : list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("====按照价格排序后====");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void sort(List list) {
        //遍历 比较
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                //取出对象 进行下一步比较
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}
