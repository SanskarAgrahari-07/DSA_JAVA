package LinkedLists;

import java.util.Scanner;

public class SLL_Queue {
    public static void main(String[] args) {
        
        LL list = new LL();
        list.insertFirst(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(5);
        list.printList();
        // Queue q2 = new Queue();
        list.findDuplicates();
        list.printQueue();
        list.printList();
        LL newList = list.Queue_LL();
        newList.printList();

        
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class Queue {
    Scanner sc = new Scanner(System.in);
    int front=-1;
    int rear=-1;
    int[] queue = new int[5];
    // int size;
       
    public void enqueue(int ele) {
        if(rear == 4) {
            System.out.println("Queue is full.");
        }
        else if(front == -1) {
            front++;
            rear++;
            queue[rear] = ele;
        }
        else {
            rear++;
            queue[rear]  = ele;
        }

    }

    public LL Queue_LL() {
        LL newList = new LL();
        for(int i=front;i<=rear;i++) {
            newList.insertLast(queue[i]);
        }
        return newList;
    }

    public void printQueue() {
        System.out.println("The duplicate elements are");
        for(int i=front;i<=rear;i++) {
            System.out.println(queue[i]);
        }
    }
}
class LL extends Queue {
    Node head;
    Node tail;
    
    // Queue q1 = new Queue();
    public void insertFirst(int val) {
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
        if(tail==null)
            tail=head; 
    }

    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
    }

    public void findDuplicates() {
        Node node = head;
        while(node!=null) {
            int key = node.value;
            Node curr = node;
            while(curr.next!=null) {
                if(key == curr.next.value) {
                    enqueue(curr.next.value);
                    curr.next = curr.next.next;    
                }
                curr = curr.next;
            }
            node = node.next;
        }
    }
    public void printList() {
        Node node = head;
        while(node!= null) {
            System.out.print(node.value +"->");
            node = node.next;
        }
        System.out.println("End");
    }


    }



