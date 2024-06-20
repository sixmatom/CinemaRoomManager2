import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            while (n % 3 != 0) {
                n++;
            }System.out.println(n);
        } else {
            System.out.println("-1");
        }

        sc.close();
    }
}