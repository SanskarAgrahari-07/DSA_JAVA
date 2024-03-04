package LinkedLists;

import java.util.Scanner;

class SLL {
    Node head;
    Node tail;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public void enqueue(int value) {
        Node node = new Node(value);
        if(head == null) {
            node.next = head;
            head = node;
        }
        if(tail == null) {
            tail = head;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void dequeue() {
        if(head == null) {
            System.out.println("Queue is Empty");
        }
        else if(head == tail) {
            int x = head.val;
            head = tail = null;
            System.out.println(x + " has been deleted");
        }
        else {
            int x = head.val;
            head = head.next;
            System.out.println(x + " has been deleted");
        }
            
    }

    public void peek() {
        System.out.println(head.val + " is the first element.");
    }

    public void printList() {
        Node node = head;
        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("End");
    }

}

public class SinglyListUsingQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL s1 =new SLL();
        boolean i = true;
        while(i) {
        System.out.println("1.enqueue()  2.dequeue()  3.peek()  4.printList()  0.exit()");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the value to be enqueue-->");
                int key = sc.nextInt();
                s1.enqueue(key);
                break;
            case 2:
                s1.dequeue();
                break;
            case 3:
                s1.peek();
                break;
            case 4:
                s1.printList();
                break;
            default:
                i = false;
                System.out.println("Exit...");
                break;
        }
    }
}
    
}
