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

    public void get(T data){
        //implement code for this
    }

    public ListNode pop(){
        ListNode current = this.head;

        while(current.next.next != null) {
            current = current.next;
        }
        ListNode temp = current.next;
        current.next = null;
        this.size--;
        this.tail = current;
        return temp;

    }

    public void print(){
        ListNode<T> curr = this.head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("%");
        System.out.println("");
        System.out.println("Size of list is: " + this.getSize() + " nodes");
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getTail() {
        return tail;
    }
}
