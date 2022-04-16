package com.company;

public class LinkedList<T> {
    public ListNode head;
    public ListNode tail;

    public LinkedList(T data){
        this.head = new ListNode(data);
        this.tail = this.head;
    }
    public void add(T data){
        this.tail.next = new ListNode(data);
        this.tail = this.tail.next;
    }

    public void print(){
        ListNode<T> curr = this.head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("%");
        System.out.println("");
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }
}
