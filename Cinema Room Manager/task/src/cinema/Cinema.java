package cinema;

import java.util.Scanner;

public class Cinema {
    private static final Scanner scanner = new Scanner(System.in);
    private static char[][] cinema;
    private static int rows;
    private static int seatsPerRow;
    private static int purchasedTickets = 0;
    private static int currentIncome = 0;
    private static int totalIncome;

    public static void main(String[] args) {
        initializeCinema();
        totalIncome = calculateTotalIncome(rows, seatsPerRow);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            handleMenuChoice(choice);
        }
    }

    private static void initializeCinema() {
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatsPerRow = scanner.nextInt();
        cinema = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinema[i][j] = 'S';
            }
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                displaySeats();
                break;
            case 2:
                buyTicket();
                break;
            case 3:
                displayStatistics();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void displaySeats() {
        System.out.println("Cinema:");
        printColumnHeaders();
        for (int i = 0; i < rows; i++) {
            printRow(i);
        }
    }

    private static void printColumnHeaders() {
        System.out.print("  ");
        for (int i = 1; i <= seatsPerRow; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printRow(int rowIndex) {
        System.out.print((rowIndex + 1) + " ");
        for (int j = 0; j < seatsPerRow; j++) {
            System.out.print(cinema[rowIndex][j] + " ");
        }
        System.out.println();
    }

    private static void buyTicket() {
        while (true) {
            int row = getInput("Enter a row number:");
            int seat = getInput("Enter a seat number in that row:");

            if (!isWithinBounds(row, seat)) {
                System.out.println("Wrong input!");
            } else if (cinema[row - 1][seat - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                int ticketPrice = calculateTicketPrice(row);
                cinema[row - 1][seat - 1] = 'B';
                purchasedTickets++;
                currentIncome += ticketPrice;

                System.out.println("Ticket price: $" + ticketPrice);
                break;
            }
        }
    }

    private static boolean isWithinBounds(int row, int seat) {
        return row > 0 && row <= rows && seat > 0 && seat <= seatsPerRow;
    }

    private static int getInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private static int calculateTicketPrice(int row) {
        int totalSeats = rows * seatsPerRow;
        if (totalSeats <= 60) {
            return 10;
        } else {
            int frontHalfRows = rows / 2;
            return row <= frontHalfRows ? 10 : 8;
        }
    }

    private static void displayStatistics() {
        float percentage = ((float) purchasedTickets / (rows * seatsPerRow)) * 100;

        System.out.println("Number of purchased tickets: " + purchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }

    private static int calculateTotalIncome(int rows, int seatsPerRow) {
        int totalSeats = rows * seatsPerRow;
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;
            return (frontHalfRows * seatsPerRow * 10) + (backHalfRows * seatsPerRow * 8);
        }
    }
}
