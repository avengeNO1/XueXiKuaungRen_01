package com.learn.collection_.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author HuAng
 */
public class MapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("no1", "java");//k-v
        map.put("no2", "php");
        map.put(new Car(),new Person());
        //解读
        // 1 k-v最后是HashMap$Node newNode(Node, key, value, null)
        //2. k-v 为了方便程序员的遍历 会创建 EntrySet集合，该集合存放的元素类型 Entry，而一个Entry
        // 对象就有k,v EntrySet<Entry<K,V>>  就是 transient Set<Map.Entry<K,V>> entrySet;
        //3.entrySet中，定义的类是Map.Entry 但是实际上存放的是HashMap$Node
        //这是因为HashMap$Node implement Map.Entry <K,V>
        //4.当把HashMap$Node 对象 存放到entrySet 就方便我们的遍历了，因为Mao.Entry提供了重要的方法
        //K getKey();  V getValue();
        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet
        for (Object o : set) {
            //System.out.println(o.getClass());//HashMap$Node
            //为了从HashMap$Node中取出k-v
            //1.先向下转型
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}
class Car{}
class Person{}

   