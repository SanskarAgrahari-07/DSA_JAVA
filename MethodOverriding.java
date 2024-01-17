class A {
    public void show() {
        System.out.println("In class A");
    }
}
class B extends A {
    public void show() {      // Method Overriding
        System.out.println("In class B");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        B b1 = new B();
        b1.show();    /* b1 will give prefernce to its method show() of B class
                         instead of A class.  */ 
    }                  //Overriding is done of show() between A and B class.
    
}
