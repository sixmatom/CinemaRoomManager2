import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read float value from user and assign it to floatVariable
        float floatVariable = scanner.nextFloat();
        int result = (int) floatVariable / 2;
        // Here you need to write the code to perform the division and the type cast operation
        // The result should be of integer type
        System.out.println(result);
        // Print the integer result
        // Here again, you need to write the code part

        // Close the Scanner
        scanner.close();
    }
}