package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(new ListNode("cool"));
        ll.add(new ListNode<>("man"));
        ll.add(new ListNode<>("I'm vijay"));
        ll.print();

    }
}
