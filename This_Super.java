class person {
    person() {
        System.out.println("Default Constructor of Super class");
    }
    person(int n) {
        System.out.println("Parametrized constructor of super class");
    }
}
class student extends person {
    student() {
        super(); //Calls the contructor of super class
        System.out.println("Default Constructor of derived class");
    }
    student(int n) {
        this(); // calls the constructor of same class
        System.out.println("parametrized Constructor of derived class");
    }
}

public class This_Super {
    public static void main(String args[]) {
         student s1 = new student(5);

    }
}
