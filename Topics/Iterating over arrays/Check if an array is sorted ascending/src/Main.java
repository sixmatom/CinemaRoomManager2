import java.util.Scanner;
import java.util.Arrays;

public class Main {
    // Method to check if the array is sorted in ascending order
    private static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = Integer.parseInt(scanner.nextLine());

        // Read the array elements
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Check if the array is sorted in ascending order
        boolean result = isSortedAscending(arr);

        // Print the result
        System.out.println(result);
    }
}
