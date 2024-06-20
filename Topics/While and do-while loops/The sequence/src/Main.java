import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        int input = 0;
        while (number > 0) {
            input = scanner.nextInt();
            if (input % 4 == 0 && input > result) {
                result = input;
            }
            number--;
        }
        System.out.println(result);
    }
}
