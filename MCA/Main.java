package MCA;
import MCA.Student;
import java.util.*;
public class Main {
    public static void main(String a[]) {
        // Student s1 = new Student(101, "Sanskar", 90, 89, 93);
        Scanner sc = new Scanner(System.in);
        int m,b,c;
        System.out.println("Enter your name");
        String n = sc.nextLine();
        System.out.println("Enter your Roll number");
        int r = sc.nextInt();
        System.out.println("Enter the marks of the three subjects");
        m = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Student s1 = new Student(r, n, m, b, c);
        s1.dispaly();

        
    }
}
