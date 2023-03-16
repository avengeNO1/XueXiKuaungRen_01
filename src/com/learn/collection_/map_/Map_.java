package com.learn.collection_.map_;

import java.util.HashMap;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("no1", "kk");//K -V
        map.put("no2", "vv");
        map.put("no3", "cc");
        map.put("no2", "HH");
        map.put(null, null);

        System.out.println("map = " + map);
        //通过get方法 传入key 会返回对应的value
        System.out.println(map.get("no1"));
    }
}

   