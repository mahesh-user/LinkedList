package com.bridgelabz;

public class MainLInkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(70);
        list.insertAtStart(30);
        list.insertAtStart(56);

        list.print();
    }
}
