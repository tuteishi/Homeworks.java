package homework9IOStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Order {
    private Object products = null;
    Long idOrder;
    private String nameOrder;
    private Date dateOrder;
    Date date;
    File file = Path.of("resources", "order.txt").toFile();

    public Long generatedId() {
        return idOrder = 1000000000 + (long) (Math.random() * 2147483647);
    }

    public void createdFileOrder() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addOrder() {
//        Path path = Path.of("resources", "order.txt");
        List<Product> products = new ArrayList<>();
        while (true) {
            System.out.println("Enter product name for order or '0' for finish add product: ");
            Scanner scanner = new Scanner(System.in);
            String productName = scanner.nextLine();
            if (productName.equals("0")) {
                break;
            }
            Product product = new Product(productName);
            products.add(product);
        }
        System.out.println("Enter order name: ");
        Scanner scanner = new Scanner(System.in);
        String orderName = scanner.nextLine();
        Order order = new Order(orderName, products);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(order.toString());
            fileWriter.write(System.lineSeparator());
//            Files.write(path, order.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter '1' to add new order or enter any symbol for finish add order.");
        Scanner scanner1 = new Scanner(System.in);
        String newProduct = scanner1.next();
        if (newProduct.equals("1")) {
            addOrder();
        }
    }

    public void showOrders() {
        try (var fileReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String text = fileReader
                    .lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteOrder() {
        List<String> lines = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
            System.out.println("Enter ID order to delete: ");
            Scanner scanner = new Scanner(System.in);
            String choiceID = scanner.next();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.regionMatches(9, choiceID, 0, 10) |
                        line.regionMatches(23, choiceID, 0, 10)) {
                    System.out.println("Order with ID: " + choiceID + " delete.");
                } else {
                    lines.add(line);
                }
            }
            bufferedReader.close();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8));
            for (String s : lines) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter '1' to delete order or enter any symbol for finish delete order.");
        Scanner scanner1 = new Scanner(System.in);
        String deleteNewProduct = scanner1.next();
        if (deleteNewProduct.equals("1")) {
            deleteOrder();
        }
    }

    public Order(String nameOrder, Object products) {
        this.idOrder = generatedId();
        this.nameOrder = nameOrder;
        this.dateOrder = new Date();
        this.products = products;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return
                "Order ID:" + idOrder +
                        ", Order name:'" + nameOrder + '\'' +
                        ", Date:" + dateOrder +
                        System.lineSeparator() +
                        "  Products of order(ID:" + idOrder
                        +"): "
                        + products;
    }
}