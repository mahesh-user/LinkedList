package com.bridgelabz;

public class MainLInkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.append(56);
        //list.append(30);
        list.append(70);
        list.insertAt(1,30);

        list.print();
    }
}
