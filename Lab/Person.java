package Lab;
import java.util.Scanner;
import java.util.*;
import Lab.Student;

public class Person {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name = sc.nextLine();

        Student s1 = new Student();
        s1.disp(name);
    
    }
}

