import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first name
        String firstName = scanner.nextLine();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        // Read the last name
        String lastName = scanner.nextLine();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        // Read the age as an integer
        int age = scanner.nextInt();

        // Print the greeting message
        System.out.println("Hello, " + firstName + " " + lastName + ". You are " + age + " years old.");
    }
}