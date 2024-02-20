package LinkedLists;

import java.util.Scanner;

public class singlyLinkedList {
   
    public static void main(String[] args) {
        LL list = new LL();
        LL list1 = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(99);
        list.insertIndex(8, 2);
        list.printList();
        System.out.println(list.deleteFirst()+" is deleted.");
        list.printList();
        System.out.println(list.deleteLast()+" is deleted.");
        list.printList();
        System.out.println(list.deleteIndex(2)+" is deleted.");
        list.printList();
        System.out.println(list.findIndex(8));
        System.out.println(list.deleteBefore(3) + " is deleted.");
        list.printList();
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(16);
        list.printList();
        System.out.println(list.deleteAfter(14) + " is deleted.");
        list.printList();
        list.insertBefore(12);
        list.printList();
        list.insertAfter(12);
        list.printList();

        list1.insertFirst(50);
        list1.insertFirst(51);
        list1.insertFirst(52);
        list1.insertFirst(53);
        list1.insertFirst(54);

        list.listConcatenate(list, list1);
        System.out.println("Concatenation of Two lists:");
        list.printList();

    }
}


class LL {
    Scanner sc = new Scanner(System.in);
    private Node head;
    private Node tail;
    private int size;
    
    LL() {
        this.size =0;
    }
    
    public void insertFirst(int val) {
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
        if(tail==null)
            tail=head;
        size+=1;  
    }

    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(int val,int index) {
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size-1) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++) {
             temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return val;
    }

     public int deleteLast() {
        Node node = head;
        for(int i=0;i<size-2;i++) {
            node = node.next;
        }
        int val = tail.value;
        tail = node;
        tail.next = null;
        size--;

        return val;
     }

     public int deleteIndex(int index) {
        if(index==0) {
            int val = deleteFirst();
            return val;
        }
        if(index==size-1) {
            int val = deleteLast();
            return val;
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node findIndex(int val) {
        Node node = head;
        while(node!=null){
            if(node.value==val)
                return node;
            else
                node = node.next;
        }
        return null;
    }

    public int deleteBefore(int val) {
        if(head.next==null || head.value==val || head==null)
            return -1;

        Node node = head;
        Node pre = null;
        while( node.next!=null && node.next.value!=val ) {
            pre = node;
            node = node.next;
        }
        int key = node.value;
        pre.next = node.next;
        size--;

        return key;
    }

    public int deleteAfter(int val) {
        Node node = head;
        while(node.next!=null && node.value!=val) {
            node = node.next;
        }
        int key = node.next.value;
        node.next = node.next.next;
        size--;
        return key;
    }

    public void insertBefore(int key) {
        System.out.println("Enter the value to be inserted");
        int val = sc.nextInt();
        Node cur = new Node(val);
        if(cur == head){
            insertFirst(val);
        }
        Node node = head;
        while(node.next!=null && node.next.value!=key){
            node = node.next;
        }
        cur.next = node.next;
        node.next = cur;
    }

    public void insertAfter(int key) {
        System.out.println("Enter the value to be inserted");
        int val = sc.nextInt();
        Node cur = new Node(val);
        if(cur == tail){
            insertLast(val);
        }
        Node node = head;
        while(node.next!=null && node.value!=key){
            node = node.next;
        }
        cur.next = node.next;
        node.next = cur;
    }


public Node listConcatenate(LL list, LL list1) {
    Node original = list.head;
    Node cur = list.head;
    Node pre = null;
    while(cur!=null) {
        pre = cur;
        cur = cur.next;
    }
    pre.next = list1.head;
    return original;
}

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        
    }
        
}

