import java.util.Scanner;

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        int rowIndex = 2;
        for (int i = 0; i < twoDimArray[rowIndex].length; i++) {
            System.out.print(twoDimArray[rowIndex][i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] twoDimArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDimArray[i][j] = sc.nextInt();
            }
        }
        printTheThirdRow(twoDimArray);
    }

}