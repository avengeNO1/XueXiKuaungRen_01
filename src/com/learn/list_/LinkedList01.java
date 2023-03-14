package com.learn.list_;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mary = new Node("mary");

        //连接三个结点，形成双向链表
        //jack -> tom -> mary
        jack.next = tom;
        tom.next = mary;
        //mary -> tom -> jack
        mary.pre = tom;
        tom.pre = jack;

        Node first = jack;//让first 引用指向jack，就是双向链表的头结点
        Node last = mary;//让last 引用指向mary，就是双向链表的尾结点

        //从头到尾遍历
        System.out.println("====从头到尾遍历===");
        while (true){
            if (first == null){
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }
        //从尾到头遍历
        System.out.println("====从尾到头遍历===");
        while (true){
            if (last == null){
                break;
            }
            //输出first 信息
            System.out.println(last);
            last = last.pre;
        }

        //链表添加数据
        /*
        在 tom 和mary 之间加一个人smith
         */
        //1 先创建一个 Node 结点 ，name就是smith
        Node smith = new Node("smith");
        smith.next = mary;
        smith.pre = tom;
        mary.pre = smith;
        tom.next = smith;

         first = jack;//让first 再次指向jack，就是双向链表的头结点
        //从头到尾遍历
        System.out.println("====从头到尾遍历===");
        while (true){
            if (first == null){
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }
        last = mary;//让last 引用再次指向mary，就是双向链表的尾结点
        //从尾到头遍历
        System.out.println("====从尾到头遍历===");
        while (true){
            if (last == null){
                break;
            }
            //输出first 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个Node类， Node对象 表示双向链表的一个结点
class Node {
    public Object item;//真正存放数据
    public Node next;//指向下一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
   