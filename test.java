import java.util.Scanner;

class Check {
    Scanner sc = new Scanner(System.in);
     int x;
    Check() {
        x = sc.nextInt();
    }
    void disp() {
        System.out.println("Base class");
    }
}
class B extends Check {
  public int y ;
  B() {
    super();
    y = x+6;
  }
 public void disp1() {
    System.out.println(y);
 }

}

public class test {
    public static void main(String args[]) {
        B b1 = new B();
        b1.disp();
        b1.disp1();

    }
}
