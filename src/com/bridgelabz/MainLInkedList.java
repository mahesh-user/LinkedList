package com.bridgelabz;

public class MainLInkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insertAfter(30,40);
        list.delete(40);
        System.out.println("size of the list : " + list.size());
        list.print();
    }
}
