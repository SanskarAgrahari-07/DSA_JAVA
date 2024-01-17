import java.util.Scanner;;

class Mobile {
    Scanner sc = new Scanner(System.in);
    String brand;
   static String name;
    int price;
    Mobile() {
        System.out.println("In constructor");
        System.out.println("Enter the price and brand");
        price = sc.nextInt();
        brand = sc.next();
    }
    static {
        System.out.println("In Static block");
        // System.out.println("Enter the name of the phone");
        name = "SmartPhone";
    }
    void disp() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Static_Block {
    public static void main(String args[]) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.disp();
        m2.disp();


    }
}