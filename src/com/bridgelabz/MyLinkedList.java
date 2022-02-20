package com.bridgelabz;

public class MyLinkedList {
    MyNode head,tail;

    public void add(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void insertAtStart(int data){
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(int data){
        MyNode newNode = new MyNode(data);
        if (head == null){
            head = newNode;
            head.next = null;
        }
        else {
            MyNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }
    }


    class MyNode{
        int data;
        MyNode next;

        MyNode(int data){
            this.data = data;
            next = null;
        }
    }


    void print(){
        MyNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
