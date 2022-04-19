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
        ll.add(6);
        ll.print();
        ListNode five = ll.searchList(5);
        ll.searchList(23);
        ListNode two = ll.searchList(2);
        ll.deleteOneAfter(two);
        ll.print();
        ll.insertOneAfter(two, five);
        ll.print();
    }
}
