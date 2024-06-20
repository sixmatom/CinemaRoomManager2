import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        // Create an array to store the elements
        int[] array = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Print the sum of the elements
        System.out.println(sum);
    }
}
