package com.learn.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList = " + linkedList);

        linkedList.remove();//默认删除第一个节点
        //linkedList.remove(2);
        System.out.println("LinkedList = " + linkedList);
        //修改
        linkedList.set(1, 22);
        System.out.println("LinkedList = " + linkedList);
        //得到
        Object o = linkedList.get(1);
        System.out.println("object = " + o);
        //因为 LinkedList 是实现了List接口 遍历方式
        System.out.println("===LinkedList遍历迭代器===");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next =" + next);
        }
        System.out.println("===增强for===");
        for (Object o1 : linkedList) {
            System.out.println("o1 = " + o1);
        }

        //源码分析

        /*
         1.LinkedList linkedList = new LinkedList();
            public LinkedList() { }
         2. 此时 LinkedList 的属性first 和 last 为null
         3.执行添加 public boolean add(E e) {
                linkLast(e);
                return true;
            }
          4.将新的节点 加入到双向链表的最后
          void linkLast(E e) {
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }
        删除结点
        1.linkedList.remove();//默认删除第一个节点
        执行
         public E remove() {
            return removeFirst();
        }
        2. 执行
         public E removeFirst() {
            final Node<E> f = first;
            if (f == null)
                throw new NoSuchElementException();
            return unlinkFirst(f);
        }
        3.执行unlinkFirst 将f 指向的双向链表的第一个结点拿掉
        private E unlinkFirst(Node<E> f) {
            // assert f == first && f != null;
            final E element = f.item;
            final Node<E> next = f.next;
            f.item = null;
            f.next = null; // help GC
            first = next;
            if (next == null)
                last = null;
            else
                next.prev = null;
            size--;
            modCount++;
            return element;
        }
         */
    }
}

   