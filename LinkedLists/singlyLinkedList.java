package LinkedLists;

import java.util.Scanner;

public class singlyLinkedList {
   
    public static void main(String[] args) {
        LL list = new LL();
        LL list1 = new LL();
        LL list2 = new LL();
        LL list3 = new LL();
        LL list4 = new LL();
        LL list5 = new LL();
    

    
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(99);
        list.insertIndex(8, 2);
        list.printList();
        // System.out.println(list.deleteFirst()+" is deleted.");
        // list.printList();
        // System.out.println(list.deleteLast()+" is deleted.");
        // list.printList();
        // System.out.println(list.deleteIndex(2)+" is deleted.");
        // list.printList();
        // System.out.println(list.findIndex(8));
        // System.out.println(list.deleteBefore(3) + " is deleted.");
        // list.printList();
        // list.insertFirst(12);
        // list.insertFirst(13);
        // list.insertFirst(14);
        // list.insertFirst(15);
        // list.insertFirst(16);
        // list.printList();
        // System.out.println(list.deleteAfter(14) + " is deleted.");
        // list.printList();
        // list.insertBefore(12);
        // list.printList();
        // list.insertAfter(12);
        // list.printList();

        list1.insertFirst(54);
        list1.insertFirst(53);
        list1.insertFirst(53);
        list1.insertFirst(51);
        list1.insertFirst(51);
        list1.printList();
        list1.removeDuplicates();
        list1.printList();
        // list.listConcatenate(list, list1);
        // System.out.println("Concatenation of Two lists:");
        // list.printList();


        // list1.insertRec(11,2);
        // list1.printList();

        list3.insertLast(1);
        list3.insertLast(2);
        list3.insertLast(4);
        list3.printList();

        list4.insertLast(1);
        list4.insertLast(1);
        list4.insertLast(3);
        list4.insertLast(1);
        list4.insertLast(4);
        list4.insertLast(5);
        list4.insertLast(1);
        list4.insertLast(6);
        list4.printList();

        LL newList = list2.mergeLists(list3, list4);
        newList.printList();

         list4.reverseList();
        list4.printList();

        list4.splitList();
        
        list4.printList();
        int ans = list4.frequecy(1);
        System.out.println(ans);

        list5.insertLast(1);
        list5.insertLast(2);
        list5.insertLast(-1);
        list5.insertLast(4);
        list5.insertLast(-2);
        list5.insertLast(-3);
        list5.insertLast(5);
        list5.printList();
        list5.positiveNegative();
        list5.printList();
        list5.removeAlternateNode();
        list5.printList();



    }
}


class LL {

    // Node head1, head2;

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        
    }
        
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

    //Insert using Recurison function 

    public void insertRec(int val, int index) {
         head = insertRec(val, index, head);
         
    }

    private Node insertRec(int val,int index, Node node) {
        if(index==0) {
            Node temp = new Node(val);
            temp.next = node.next;
            node.next = temp;
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
         return node;
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
        if(head.next == null) {
            int val = head.value;
            tail = head = null;
            return val;
        }
        while(node.next.next != null) {
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

    public void removeDuplicates() {
        Node node = head;
        while(node.next!=null) {
            if(node.value==node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }  
        tail = node;
        node.next = null;
                
    }

    public static LL mergeLists(LL first, LL second) {
        Node node1 = first.head;
        Node node2 = second.head;

        LL newList = new LL();

        while(node1 !=null && node2 !=null) {
            if(node1.value < node2.value) {
                newList.insertLast(node1.value);
                node1 = node1.next;
            }
            else {
                newList.insertLast(node2.value);
                node2 = node2.next;
            }
        }
        while(node1 != null) {
            newList.insertLast(node1.value);
            node1 = node1.next;
        }
        while(node2 != null) {
            newList.insertLast(node2.value);
            node2 = node2.next;
        }

        return newList;
    }

    public boolean listCycle(LL list) {
        Node fast  = head;
        Node slow = head;

        while(fast != null && slow != null) {
            if(fast == slow) 
                return true;
            
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public void reverseList() {
        Node cur = head;
        Node pre = null;    //previous pointer
        Node Next = null;   //next pointer
        while(cur != null ) {
            Next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = Next;
        }
        tail = head;
        head = pre;
    }

    //Splitting the list by counting the number of nodes
    public void splitList() {
        Node node = head;
        int count = 0;
        while(node != null) {
            node = node.next;
            count++;
        }
        int half = count / 2;
        Node temp = head;
        System.out.println("The first half of the list is:");
        for(int i=0;i<half;i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
        
        System.out.println("The second half of the list is:");
        Node head2 = temp;
        while(head2 != null) {
            System.out.print(head2.value + "->");
            head2 = head2.next;
        }
        System.out.println("End");
    }

    public int intersectionList(Node head1, Node head2) {
        Node node1 = head1;
        Node node2 = head2;

        while(node1 != null) {
            while(node2 != null) {
                if(node1.value == node2.value)
                    return node1.value;
                node2 = node2.next;
            }
            node2 = head2;
            node1 = node1.next;
        }
        return -1;   // Returns if there is no intersection value
          
    }

    public Node middleNode() {
        Node fast = head;
        Node slow = fast;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void removeElement(int val) {
        Node node = head;
        Node pre = null;
        while(node != null && node.next != null) {
            if(node.value != val) {
                pre = node;
                node = node.next;
            }
            else {
                pre = node.next;
                node = node.next.next;
            }
        }
    }

    public int frequecy(int val) {
        Node node = head;
        int count =0;
        while(node != null) {
            if(node.value == val) {
                count++;
            }
            node = node.next;
        }
        return count;
    }

    public void positiveNegative() {
        LL pos = new LL();
        LL neg = new LL();
        Node node = head;
        while(node != null) {
            if(node.value >= 0) {
                pos.insertLast(node.value);
            }
            else {
                neg.insertLast(node.value);
            }
            node = node.next;
        }
        System.out.println("The positive elements of the list are:");
        pos.printList();
        System.out.println("The negative elements of the list are:");
        neg.printList();
    }

    public void removeAlternateNode() {
        Node node = head;
        while(node.next != null ) {
            node.next = node.next.next;
            node = node.next;
        }
    }

    

        

        
}

