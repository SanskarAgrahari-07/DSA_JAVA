abstract class Car {
    public abstract void drive();
    public void mileage() {
        System.out.println("It has a good mileage");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

public class AbstractClass  {
    public static void main(String args[]) {
        WagonR w1 = new WagonR();
        w1.drive();
        w1.mileage();
    }
}
