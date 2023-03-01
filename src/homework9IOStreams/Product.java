package homework9IOStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Product {
    private Long idProduct;
    private String nameProduct;
    private Date dateProduct;
    //    File file = new File(String.join(File.separator, "resources" , "product.txt"));  для 8-й Java
    File file = Path.of("resources", "product.txt").toFile();


    public void createdFileOrder() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Long generatedId() {
        return idProduct = 1000000000 + (long) (Math.random() * 2147483647);
    }

    public void addProduct() {
        System.out.println("Enter product name: ");
        Scanner scanner = new Scanner(System.in);
        String productName = scanner.next();
        Product product = new Product(productName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write(product.toString().getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter '1' to add new product or enter any symbol for finish add product.");
        Scanner scanner1 = new Scanner(System.in);
        String newProduct = scanner1.next();
        if (newProduct.equals("1")) {
            addProduct();
        }
    }

    public void showProducts() {
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
//            byte[] bytes = fileInputStream.readAllBytes();
//            String productText = new String(bytes);
//            System.out.println(productText);
            byte[] bytes = new byte[fileInputStream.available()];
            int count = 0;
            byte currentbByte;
            while ((currentbByte = (byte) fileInputStream.read()) != -1) {
                bytes[count++] = currentbByte;
            }
            String productText = new String(bytes);
            System.out.println(productText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct() {
        List<String> lines = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8));
            System.out.println("Enter ID product to delete: ");
            Scanner scanner = new Scanner(System.in);
            String choiceID = scanner.next();
            while ((line = bufferedReader.readLine()) != null) {
                if (line.regionMatches(11, choiceID, 0, 10)) {
                    System.out.println("Product with ID: " + choiceID + " delete.");
                } else {
                    lines.add(line);
                }
            }
            bufferedReader.close();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8));
            for (String s : lines) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter '1' to delete product or enter any symbol for finish delete product.");
        Scanner scanner1 = new Scanner(System.in);
        String deleteNewProduct = scanner1.next();
        if (deleteNewProduct.equals("1")) {
            deleteProduct();
        }
    }

    public Product(String nameProduct) {
        this.idProduct = generatedId();
        this.nameProduct = nameProduct;
        this.dateProduct = new Date();
    }

    public Product() {
    }

    @Override
    public String toString() {
        return
                "Product ID:" + idProduct +
                        ", Product name:'" + nameProduct + '\'' +
                        ", Date:" + dateProduct
                        + "|";
    }
}