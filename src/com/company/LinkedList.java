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

    //O(1) Insertion
    public void add(T data){
        this.tail.next = new ListNode(data);
        this.tail = this.tail.next;
        this.size++;
    }

    //O(1) Lookup
    public int getSize() {
        return size;
    }

    //O(N) Lookup
    public ListNode searchList(T data){
        ListNode current = this.head;
        int position = 0;
        while(current != null){
            if(current.data == data){
                System.out.println("Found at position: " + position +  ", data: " + current.data);
                return current;
            }
            current = current.next;
            position++;
        }
        System.out.println("Sorry " + data + " is not in the list");
        return null;
    }


    //O(N) to pop using head
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

    public void insertOneAfter(ListNode aNode, ListNode insertNode){
        insertNode.next = aNode.next;
        aNode.next = insertNode;
        this.size++;
    }

    public void deleteOneAfter(ListNode aNode){
        aNode.next = aNode.next.next;
        this.size--;
    }

    //O(N)
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

    //O(1) Lookup
    public ListNode getHead() {
        return head;
    }

    //O(1) Lookup
    public ListNode getTail() {
        return tail;
    }
}
