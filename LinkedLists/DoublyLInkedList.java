package LinkedLists;

import java.util.Scanner;

class DLL {
    Scanner sc = new Scanner(System.in);
    Node head;
    Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            node.pre = null;
            node.next = null;
            head = node;
        } else {
            head.pre = node;
            node.next = head;
            head.pre = null;
            head = node;
        }
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            node.pre = tail;
            tail = node;
        }
    }

    public void inserAfter(int key,int val) {
        Node cur = new Node(val);
        if (key == tail.value) {
            insertLast(val);
        } else {
            Node node = head;
            while (node.next != null && node.value != key) {
                node = node.next;
            }
            cur.next = node.next;
            cur.pre = node; 
            node.next = cur;
        }
    }

    public void deleteLast() {
        if(head==null){
            return;
        }
        if(head.next==null){
            head = null;
            tail= null;
        }
        Node node = tail.pre;
            node.next = null;
            tail = node;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "-->");
            node = node.next;
        }
        System.out.println("End");
    }

    private class Node {
        Node next;
        Node pre;
        int value;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.pre = null;
        }
    }
}

public class DoublyLInkedList {
    public static void main(String[] args) {
        DLL d1 = new DLL();
        d1.insertFirst(2);
        d1.insertFirst(4);
        d1.insertFirst(6);
        d1.printList();
        d1.insertLast(8);
        d1.insertLast(10);
        d1.printList();
        d1.inserAfter(4,3);
        d1.printList();
        d1.deleteLast();
        d1.printList();

    }
}
