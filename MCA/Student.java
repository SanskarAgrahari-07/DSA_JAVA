package MCA;

public class Student {
    int roll;
    String name;
    int mark1;
    int mark2;
    int mark3;
    int sum=0;
    Student(int roll, String name, int mark1, int mark2, int mark3) {
        this.roll = roll;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        sum = mark1 + mark2 + mark3;
    }
    public void dispaly() {
        System.out.println("Name: " + name + "\n" + "Sub1: "+ mark1+ "\n" + "Sub2: "+ mark2 + "\n" + "Sub3: "+ mark3+  "Total Marks: " + sum + "\n" + "Percentage: " + (sum/3) + "%");
    }
}
