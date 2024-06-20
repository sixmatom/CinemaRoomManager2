import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int number = scanner.nextInt();
        String result = ""; 
        for (int i = 1; i <= number; i++) {
            int bridge = scanner.nextInt();
            if (height >= bridge) {
                result = "Will crash on bridge " + i;
                break;
            } else {
                result = "Will not crash";
            }
        } System.out.println(result); 
    }
}
