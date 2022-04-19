package com.company;

public class LinkedList<T> {
    public ListNode head;
    public ListNode tail;
    public int size;

    public LinkedList(T data){
        this.head = new ListNode(data);
        this.tail = this.head;
        this.size++;

    }

    public void add(T data){
        this.tail.next = new ListNode(data);
        this.tail = this.tail.next;
        this.size++;
    }

    public int getSize() {
        return size;
    }

    public void pop(){
        ListNode current = this.head;
        while(current.next != null) {
            current = current.next;
        }
        System.out.println(current.data);
        //return last;
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
