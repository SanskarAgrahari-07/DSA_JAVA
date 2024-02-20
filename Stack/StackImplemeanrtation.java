package Stack;

import java.util.Scanner;

public class StackImplemeanrtation {
    Scanner sc = new Scanner(System.in);
    static int num;
    int top = -1;
    int size,n;
    int[] stack;
    StackImplemeanrtation() {
        System.out.println("Enter the size of the stack");
        size = sc.nextInt();
        stack = new int[size];
    }

    public void push(){
        if(top==size-1){
            System.out.println("Overflow");
        }
        else{
            top++;
            System.out.println("Enter the number to be pushed");
            n = sc.nextInt();
            stack[top] = n;
        }
    }

    public void pop() {
        if(top==-1) {
            System.out.println("Underflow");
        }
        else{
            int x = stack[top];
            System.out.println(x + " has been popped out.");
            top--;
        }
    }
    public void disp(){
        if(top==-1) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The elements are:");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean i=true;
        StackImplemeanrtation s1 = new StackImplemeanrtation();
        
        
        while(i) {
        System.out.println("The operations are:");
        System.out.println("1.push()\n2.pop()\n3.display()\n4.exit");
        System.out.println("Enter the choice for the operations");
        num = sc.nextInt();
        if(num>=4)
            i= false;
        else {
        switch(num) {
            case 1:
                s1.push();
                break;
            case 2:
                s1.pop();
                break;
            case 3:
                s1.disp();
                break;
        }
    }
        }

        
    }
}
