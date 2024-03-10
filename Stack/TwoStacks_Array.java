package Stack;

import java.util.Scanner;

public class TwoStacks_Array {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        Stack s1 = new Stack();

        int choice;
        boolean i = true;
        while(i) {
            System.out.println("Enter your choice:");
            System.out.println("1.push_Front 2.push_Back 3.pop_Front 4.pop_Back 5.printFront 6.printBack 0.exit");
            choice = ob.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to be pushed:");
                    int val = ob.nextInt();
                    s1.push1(val);
                    break;
                case 2:
                    System.out.println("Enter the value to be pushed:");
                    val = ob.nextInt();
                    s1.push2(val);
                    break;
                case 3:
                    s1.pop1();
                    break;
                case 4:
                    s1.pop2();
                    break;
                case 5:
                    s1.printFront();
                    break;
                case 6:
                    s1.printBack();
                    break;
            
                default:
                    i = false;
                    System.out.println("Exit...");
                    break;
            }
        }
        
    }
}
class Stack {
    Scanner sc = new Scanner(System.in);
    int top1;
    int top2;
    int[] arr;
    int size;

    Stack() {
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        arr = new int[size];
        top1 = -1;
        top2 = arr.length;
    }

    public void push1(int val) {
        if((top1+1) == top2) {
            System.out.println("Stack Overflow from the front");
        }
        else if(top1 == -1) {
            top1++;
            arr[top1] = val;
        }
        else {
            top1++;
            arr[top1] = val;
        }
    }

    public void push2(int val) {
        if((top2-1) == top1) {
            System.out.println("Stack Overflow from the back");
        }
        else if(top2 == arr.length) {
            top2--;
            arr[top2] = val;
        }
        else {
            top2--;
            arr[top2] = val;
        }
    }

    public void pop1() {
        if(top1 == -1) {
            System.out.println("Stack underflow from the front");
        }
        else {
            int x = arr[top1];
            top1--;
            System.out.println(x + " has been popped out from the front.");
        }
    }

    public void pop2() {
        if(top2 == arr.length) {
            System.out.println("Stack underflow from the back");
        }
        else {
            int x = arr[top2];
            top2++;
            System.out.println(x + "has been popped out from the front.");
        }
    }

    public void printFront() {
        if(top1 == -1) {
            System.out.println("Stack underflow from the front"); 
        }
        System.out.println("The elements are:");
        for(int i=0; i <= top1; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printBack() {
        if(top2 == arr.length) {
            System.out.println("Stack underflow from the back");
        }
        System.out.println("The elements are:");
        for(int i=arr.length-1; i >= top2; i--) {
            System.out.println(arr[i]);
        }
    }

}
