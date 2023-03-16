package com.learn.collection_.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("邓超", "孙俪");
        map.put(null, "刘亦菲");
        map.put("豪杰", null);
        map.put("亿万富豪", "黄思翰");

        //第一组：先取出所有的Key，通过key取出对应的Value
        Set keySet = map.keySet();
        //1.增强for
        for (Object key :keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //2.迭代器
        System.out.println("=========");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        //第二组：先取出所有的values
        System.out.println("=====取出所有values=======");
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        //两种遍历方式
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }


    }

}

   