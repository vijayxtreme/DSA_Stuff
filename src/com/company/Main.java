package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>("cool");
        ll.add("man");
        ll.add("I'm vijay");
        ll.print();
        System.out.println("Head: " + ll.getHead().data);
        System.out.println("Tail: " + ll.getTail().data);
    }
}
