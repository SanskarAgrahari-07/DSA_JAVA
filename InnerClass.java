class A {

    public void show() {
        System.out.println("In show method...");
    }

    class B {
        public void config() {
            System.out.println("In config method...");
        }
    }
}


public class InnerClass {
    public static void main(String args[]) {
        A a1 = new A();
        a1.show();

        A.B b1 = a1.new B();  //Have to create the object of the inner class with respect to the outer class A with its object
        b1.config();
    }
}
