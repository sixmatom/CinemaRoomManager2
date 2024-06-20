import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int counter = 0;
        for (int i = 1; counter < input; i++) {
            for (int j = 0; j < i && counter < input; j++) {
                System.out.print(i + " ");
                counter++;

            }
        }
    }
}
