import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();
        switch (form) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a + b + c) / 2.0;
                System.out.println(sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                double side = scanner.nextInt();
                double height = scanner.nextInt();
                System.out.println(side * height);
                break;
            case "circle":
                double radius = scanner.nextInt();
                System.out.println(radius * radius * 3.14);
                break;
            default:
                break;
        }
    }
}