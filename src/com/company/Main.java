package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.print();
        ListNode item = ll.pop();
        ll.print();
        System.out.println(item.data);
        ListNode item2 = ll.pop();
        System.out.println(item2.data);
        ll.print();
        ll.add(5);
        ll.print();

    }
}
