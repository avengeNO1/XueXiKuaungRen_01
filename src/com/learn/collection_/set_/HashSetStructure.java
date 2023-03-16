package com.learn.collection_.set_;

/**
 * @author HuAng
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟 HashMap 的底层结构
        //1.创建数组 类型为 Node[]
        Node[] table = new Node[16];
        System.out.println("table  =" + table);
        //创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack 结点挂载到john
        Node rose = new Node("Rose", null);
        jack.next = rose;//将rose结点挂载到jack
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table  =" + table);
    }
}

class Node {//节点 存放数据
    Object item;//存放数据
    Node next;//指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
   