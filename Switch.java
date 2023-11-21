

public class Switch {
    public static void main(String args[]) {
        String day = "Monday";

        switch(day)
        {
            case "Saturday", "Sunday" -> System.out.println("10 A.M.");

            case "Monday" -> System.out.println("7 A.M");

            default -> System.out.println("8 A.M");
        }
    }
}
