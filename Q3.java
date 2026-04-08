import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day index (0-6): ");
        int index = sc.nextInt();

        try {
            System.out.println("Day: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter between 0 and 6.");
        }
    }
}
