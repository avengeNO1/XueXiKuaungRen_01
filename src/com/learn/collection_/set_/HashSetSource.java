package com.learn.collection_.set_;

import java.util.HashSet;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
           System.out.println("set = " + hashSet);

        //源码分析
        /*1.HashSet hashSet = new HashSet();
           执行HashSet
            public HashSet() {
                map = new HashMap<>();
            }
            2.执行add方法
             public boolean add(E e) {//e =“java”
                return map.put(e, PRESENT)==null;//PRESENT = (static) PRESENT = new Object();
            }
            3.执行put(),该方法会执行hash(key) 得到key对应的hash值
            public V put(K key, V value) {// key = "java" value = PRESENT
                return putVal(hash(key), key, value, false, true);
            }
            4.执行putVal
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;//定义辅助变量
                //table是HashMap的数组 类型是 Node[]
                //if语句表示如果当前的table是null 或者>= 0
                //就是第一次扩容到16个空间
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //1.根据key，得到hash 去计算该key应该存放到table表的哪个索引位置
                //并把这个位置的对象赋给p
                //2.判断p是否为null
                //2.1 如果p为null 表示还没有存放元素就创建一个Node(key=""java",value = PRESENT)
                //2.2 就放置zai 该位置 tab[i] = newNode(hash, key, value, null);
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样
                //或者满足下面两个条件之一
                //1.并且满足准备加入的key和p指向的Node结点的key是同一个对象
                //2.p指向的Node结点的key的equals()和准备加入的key比较后相同
                //就不能加入
                    Node<K,V> e; K k; // 辅助变量
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                //再判断p是不是一颗红黑树
                //如果是 就调用putTreeVal()进行添加
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else {//如果当前table对应的索引位置 已经是一个链表就使用for循环比较
                          //1.依次和该链表的每个元素比较后都不相同，则加入到该链表的最后
                          //当添加到链表后，立即判断链表是否已经达到8个结点
                          //if (binCount >= TREEIFY_THRESHOLD - 1)==》 >=7
                          //达到就调用treeifyBin() 对当前这个链表进行树华（转成红黑树）
                          //注意 table的大小达到 >= 64才会进行树华，未达到时table会扩容
                          //2.依次和该链表的每个元素比较过程中，有相同的情况就直接break
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                //size++就是每加入一个结点Node(k,v,h,next),size就会增加
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */
    }

}

   