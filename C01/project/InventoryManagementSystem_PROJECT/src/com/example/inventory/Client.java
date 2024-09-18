package com.example.inventory;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial stock quantity: ");
        int initialStock = scanner.nextInt();
        Stock stock = new Stock(initialStock);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. Process Order");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    int addAmount = scanner.nextInt();
                    stock.addStock(addAmount);
                    System.out.println("Stock updated. Current stock: " + stock.getStock());
                    break;
                case 2:
                    System.out.print("Enter amount to remove: ");
                    int removeAmount = scanner.nextInt();
                    try {
                        stock.removeStock(removeAmount);
                        System.out.println("Stock updated. Current stock: " + stock.getStock());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter order quantity: ");
                    int orderQuantity = scanner.nextInt();
                    Order order = new Order(stock);
                    try {
                        order.processOrder(orderQuantity);
                        System.out.println("Order processed. Current stock: " + stock.getStock());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    Report report = new Report(stock);
                    System.out.println(report.generateReport());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}