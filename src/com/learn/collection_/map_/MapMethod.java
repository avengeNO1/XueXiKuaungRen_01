package com.learn.collection_.map_;

import java.util.HashMap;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        //演示map常用方法
        //put 添加
        HashMap map = new HashMap();
        map.put("邓超",new Book("",22));
        map.put("邓超", "孙俪");//替换
        map.put(null, "刘亦菲");
        map.put("豪杰", null);
        map.put("亿万富豪", "黄思翰");
        System.out.println("map = " + map);
        //删除 根据键删除映射关系
        map.remove("null");
        System.out.println("map = " + map);
       Object o =  map.get("亿万富翁");
        System.out.println("o = " + o);

        System.out.println("k -v = " + map.size());

        System.out.println(map.isEmpty());
        //map.clear();
        System.out.println("map = " + map);

        System.out.println(map.containsKey("亿万富豪"));
    }
}
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}