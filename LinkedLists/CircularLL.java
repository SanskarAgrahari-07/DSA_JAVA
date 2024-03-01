package LinkedLists;

public class CircularLL {
    public static void main(String[] args) {
        CLL c1 = new CLL();
        c1.insertFirst(2);
        c1.insertFirst(4);
        c1.insertFirst(6);
        c1.insertFirst(10);
        c1.insertFirst( 12);
        c1.printList();
        c1.insertLast(8);
        c1.printList();
        c1.deleteLast();
        c1.printList();
        c1.deleteFirst();
        c1.printList();
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

class CLL {
    Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (tail == null) {
            tail = node;
            tail.next = node;
        } else {
            node.next = tail.next;
            tail.next = node;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }

    }


    public void deleteLast() { 
        if(tail == tail.next) {          //When there is only a single node
            System.out.println(tail.value + " has been deleted.");
            tail = null;
        }
        else {
            Node node = tail;
            while(node.next!=null && node.next.value!=tail.value){
                node = node.next;
            }
            System.out.println(tail.value + " has been deleted.");
            node.next = tail.next;
            tail = node;
        }

    }

    public void deleteFirst() {
        if(tail==tail.next) {
            System.out.println(tail.value + " has been deleted.");
            tail = null;
        }
        else {
            Node node = tail;
            node = node.next;
            System.out.println(node.value + " has been deleted");
            tail.next = node.next;

        }
    }


    public void printList() {
        Node node  =  tail;
        do {
            System.out.print(node.value  + "->");
            node = node.next;
        }
        while (node!= tail);
        System.out.println("End");
}
}


