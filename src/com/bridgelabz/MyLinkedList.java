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


    public void insertAt(int index,int data){
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        for (int i=0;i < index - 1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void pop(){
        MyNode temp = head;
        head = temp.next;
    }


    public void popLast(){
        MyNode temp = head;
        while ((temp.next).next != null){
            temp = temp.next;
        }
        temp.next = null;
    }


    public int search(int data){
        MyNode temp = head;
        int index = 0;
        while(temp != null){
            if (temp.data == data) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return index;
    }


    public void insertAfter(int searchData,int data){
        //creating new node
        MyNode newNode = new MyNode(data);
        MyNode temp = head;
        while (temp != null){
            if (temp.data == searchData){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
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
