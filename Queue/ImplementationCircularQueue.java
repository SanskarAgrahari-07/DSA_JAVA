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
        if(rear==size-1 && front==0 || ((rear+1)%size)==front) {
            System.out.println("Queue overflow");
        }
        else if(rear==-1){
            front++;
            rear++;
            queue[rear]=ele;
        }
        else if(rear==size-1 && front!=0) {
            rear=0;
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
        if(front==rear) {
            int x = queue[front];
            System.out.println(x + " has been dequeued.");
            front=-1;
            rear=-1;
        }
        else if(front==size-1) {
            int x = queue[front];
            front=0;
            System.out.println(x + " has been dequeued.");
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
        System.out.println("The elements are:");
        if(rear >= front) {
            for(int i=front;i<=rear;i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for(int i=front;i<size;i++) {
                System.out.println(queue[i]);
            }
            for(int i=0;i<=rear;i++) {
                System.out.println(queue[i]);
            }
        }
    }


}

public class ImplementationCircularQueue {
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
