package homework9IOStreams;

import homework8Exceptions.NegativeNumberException;

import java.util.Scanner;

public class Menu {
    public void menu() {
        while (true) {
            System.out.println("""
                    Select operation:
                    1 - show the list of products;
                    2 - add product;
                    3 - delete product;
                    4 - show the list of order;
                    5 - add order;
                    6 - delete order;
                    0 - exit.
                    """);

            Scanner scanner = new Scanner(System.in);
            String choiceNumber = scanner.next();
            try {
            int number = Integer.parseInt(choiceNumber);
                Product product = new Product();
                Order order = new Order();
                if (number > 6 || number < 0) {
                    throw new NegativeNumberException();
                }
                switch (number) {
                    case 1 -> product.showProducts();
                    case 2 -> product.addProduct();
                    case 3 -> product.deleteProduct();
                    case 4 -> order.showOrders();
                    case 5 -> order.addOrder();
                    case 6 -> order.deleteOrder();
                    case 0 -> System.exit(0);
                }
            } catch (NumberFormatException | NegativeNumberException e) {
                System.err.println("The entered data is incorrect, try again...");
                e.printStackTrace();
            }
        }
    }
}