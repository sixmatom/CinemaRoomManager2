import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 0;
        while (true) {
            int n = scanner.nextInt();
            result += n;

            if (result >= 1000) {
                System.out.println(result - 1000);
                break;

            } else if (n == 0) {
                System.out.println(result);
                break;
            }
        }
    }
}
