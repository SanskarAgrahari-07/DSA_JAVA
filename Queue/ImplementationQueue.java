package Queue;
import java.util.Scanner;

class Queue {
    Scanner sc = new Scanner(System.in);
    private int size,ele;
    private  int front=-1,rear=-1;
    private  int[] queue;
    Queue() {
        System.out.println("Enter the size of the queue");
        size = sc.nextInt();
        queue = new int[size];
    }
    public void enqueue() {
        System.out.println("Enter the element to be enqueued");
        ele = sc.nextInt();
        if(rear==size-1) {
            System.out.println("Queue overflow");
        }
        else if(rear==-1){
            front++;
            rear++;
            queue[rear]=ele;
        }
        else {
            rear++;
            queue[rear]=ele;
        }
    }

    public void dequeue() {
        if(front==-1){
            System.out.println("Queue underflow");
        }
        else if(front==rear) {
            int x = queue[front];
            System.out.println(x + " has beeb dequeued.");
            front=-1;
            rear=-1;
        }
        else{
            int x = queue[front];
            System.out.println(x + " has been dequeued.");
            front++;
        }

    }
    public void display() {
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("The elements are:");
            for(int i=front;i<=rear;i++) {
                System.out.println(queue[i]);
            }
        }
    }


}

public class ImplementationQueue {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Queue q1 = new Queue();
        
        boolean i = true;
        
        
        
        while(i) {
            System.out.println("\nThe operations are:");
            System.out.println("1.Enqueue()\n2.Dequeue()\n3.Display()\n0.exit");
            int choice = ob.nextInt();
            switch(choice) {
                case 1:
                    q1.enqueue();
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    break;
                default:
                    i=false;
                    break;
            }
        }
    }
}
