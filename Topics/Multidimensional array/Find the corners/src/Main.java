import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int rows = twoDimArray.length;
        int cols = twoDimArray[0].length;

        int topLeft = twoDimArray[0][0];
        int topRight = twoDimArray[0][cols - 1];
        int bottomRight = twoDimArray[rows - 1][cols - 1];
        int bottomLeft = twoDimArray[rows - 1][0];

        System.out.println(topLeft + " " + topRight);
        System.out.println(bottomLeft + " " + bottomRight);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the dimensions of the array
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initialize the array
        int[][] twoDimArray = new int[rows][cols];

        // Read the array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDimArray[i][j] = sc.nextInt();
            }
        }

        // Print the corners
        printCorners(twoDimArray);
    }
}
