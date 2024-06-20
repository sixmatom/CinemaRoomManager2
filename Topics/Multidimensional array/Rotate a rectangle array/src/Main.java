import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions of the input matrix
        int rows = sc.nextInt(); // number of rows
        int cols = sc.nextInt(); // number of columns

        // Initialize the input matrix
        int[][] matrix = new int[rows][cols];

        // Read the elements of the input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Initialize the rotated matrix with dimensions swapped
        int[][] rotatedMatrix = new int[cols][rows];

        // Rotate the matrix 90 degrees clockwise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
