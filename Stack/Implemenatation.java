package Stack;



import java.util.Scanner;

public class Implemenatation {
    static int top = -1;
    static int size;
    static Scanner sc = new Scanner(System.in);
    Implemenatation() {
        System.out.println("Enter the size of your Stack: ");
         size = sc.nextInt();
    }
    public  void push(int stack[]) {
        if(top==size-1)
            System.out.println("Overflow");
        else {
            top++;
            int ele;
            System.out.println("Enter the element to push: ");
            ele = sc.nextInt();
            stack[top] = ele;
        }
    }

    public  void pop(int stack[]) {
        if(top==-1) {
            System.out.println("Underflow");
        }
        else {
            int x = stack[top];
            top--;
            System.out.println(x);
        }
    }
    public  void display(int stack[]) {
        if(top==-1) {
            System.out.println("Underflow");
        }
        else {
            for(int i=0;i<=top;i++) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        Implemenatation i1 = new Implemenatation();

        
        int[] stack = new int[size];
        i1.push(stack);

        

    }
}
