package com.company;

public class LinkedList<T> {
    public ListNode head;
    public ListNode tail;

    public LinkedList(ListNode<T> node){
        this.head = node;
        this.tail = this.head;
    }
    public void add(ListNode<T> node){
        this.tail.next = node;
        this.tail = this.tail.next;
    }

    public void print(){
        ListNode<T> curr = this.head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("%");
    }

}
