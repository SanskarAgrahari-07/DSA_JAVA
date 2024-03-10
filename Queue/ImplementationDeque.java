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

    public void insertRear(int val) {
        if(rear == size-1) {
            System.out.println("Overflow");
        }
        else if(rear == -1) {
            front = rear = 0;
            queue[rear] = val;
        }
        else {
            queue[rear++]= val;
        }
    }

    public void deleteFront() {
        if(front == -1) {
            System.out.println("Queue overflow");
        }
        else if(front ==  rear) {
            int x = queue[front];
            front = rear =-1;
            System.out.println(x + " has been deleted.");
        }
        else {
            int x = queue[front];
            front++;
            System.out.println(x + " has been deleted.");
        }
    }

    public void deleteRear() {
        if(rear == -1) {
            System.out.println("Queue overflow");
        }
        else if(front ==  rear) {
            int x = queue[rear];
            front = rear =-1;
            System.out.println(x + " has been deleted.");
        }
        else {
            int x = queue[rear];
            rear--;
            System.out.println(x + " has been deleted.");
        }
    }

    public void printQueue() {
        if(front == -1) {
            System.out.println("Queue overflow");
        }
        for(int i=front; i<= rear; i++) {
            System.out.println(queue[i] + "->");
        }
        System.out.println("End");
    }
}

public class ImplementationDeque {
   

}
