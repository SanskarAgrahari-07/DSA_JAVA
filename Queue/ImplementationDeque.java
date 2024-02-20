package Queue;

import java.util.Scanner;

class Deque {
    static Scanner ob = new Scanner(System.in);
    int front,rear;
    int size,ele;
    int[] queue;
    Deque() {
        System.out.println("Enter the size of the queue");
        size = ob.nextInt();
        queue = new int[size];
        front= rear = -1;
    }

    public void insertFront() {
        System.out.println("Enter the number to be enqueue by front");
        ele = ob.nextInt();
        if(front==0) {
            System.out.println("Overflow");
        }
        else if(front==-1){
            front=rear=0;
            queue[front]=ele;
        }
        else{
            front-=1;
            queue[front]=ele;
        }
    }
}

public class ImplementationDeque {
   

}
