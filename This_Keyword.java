class student {
    private String name;
    private int age;

    public void getName(String name ) {
        this.name /*Instance Variable */ = name /*Local Variable */;
    }
    public void getAge(int age) {
        this.age = age;
    }
    public void disp() {
        System.out.println(name + " : " + age);
    }
}

public class This_Keyword {
    public static void main(String args[]) {
        student s1 = new student();
        s1.getName("Sanskar");
        s1.getAge(20);
        s1.disp();
    }
    
}
