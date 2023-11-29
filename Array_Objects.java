import java.util.Scanner;

class employee {
    Scanner ob = new Scanner(System.in);
       public String name;
       public int date;
       public int salary;

       employee() {
        System.out.println("Enter your name");
        name = ob.next();
        System.out.println("Enter your salary");
        salary = ob.nextInt();
        System.out.println("Enter your date of joining");
        date = ob.nextInt();
        System.out.println();

    }
    void disp() {
        System.out.println("Your name is : " + name);
        System.out.println("Your salary is : " + salary);
        System.out.println("Your date of joining is : " + date);
        System.out.println();
    }
       
        
}

public class Array_Objects {
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        employee[] st = new employee[n];
        for(int i=0;i<n;i++) {
            System.out.println("For employee No." + (i+1));
            st[i] = new employee();
        }
        for(int i=0;i<n;i++) {
            System.out.println("For employee No." + (i+1));
            st[i].disp();
        }
        //Enhance Loop for displaying name and salary of employees
        for(employee emp : st) {
            System.out.println(emp.name + " : "+ emp.salary);
        }
        
        
     }
       
    }

