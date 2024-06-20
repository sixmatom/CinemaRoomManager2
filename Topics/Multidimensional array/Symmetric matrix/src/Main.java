import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][] matrix = new int[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        boolean isSymmetric = true;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) { // Only need to check elements above the main diagonal
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        // Output the result
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}