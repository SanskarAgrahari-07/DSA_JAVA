package Stack;
 class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class LL {

    Node top;
    
    
    public void push(int val) {
        Node node = new Node(val);
        if(top==null) {
            top = node;
            // top.next = null;
        }
        else {
        node.next = top;
        top = node;
        }
    }
            
        
    public void pop() {
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
            
        int x = top.value;
        System.out.println(x + " has been popped out.");
        top = top.next;

        
    }

    public void printList() {
        Node node = top;
        while(node!=null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("End");
    }
    
}

public class ImplementLInkedList {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.printList();
        l1.pop();
        l1.printList();
    }
}
