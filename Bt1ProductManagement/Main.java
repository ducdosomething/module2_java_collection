package Bt1ProductManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductManager productManager = new ProductManager();

        productManager.addProduct(1, "Laptop", 1000);
        productManager.addProduct(2, "Fan", 1500);
        productManager.addProduct(3, "PC", 3000);
        System.out.println("List of product: ");
        productManager.displayProduct();
        System.out.println("---------------");

        System.out.println("Enter the name of the product you want to search: ");
        String searchName = scanner.nextLine();
        Product founProductByName = productManager.searchProductByName(searchName);
        if (founProductByName != null) {
            System.out.println("Found product: " + founProductByName);
        } else {
            System.out.println("Product not available!");
        }
        System.out.println("---------------");

        System.out.println("Enter the ID you want to search and update: ");
        int searchId = scanner.nextInt();
        Product foundProduct = productManager.searchProductById(searchId);
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct);
            System.out.println("Enter the new name: ");
            String newName = scanner.next();
            System.out.println("Enter new Price: ");
            double newPrice = scanner.nextDouble();

            productManager.updateProductById(searchId, newName, newPrice);
            System.out.println("Product information after update: ");
            System.out.println(foundProduct);
        } else {
            System.out.println("Product not available!");
        }
        System.out.println("---------------");

        System.out.println("Enter the id of product you want to delete: ");
        int deleteId = scanner.nextInt();
        productManager.deleteProductById(deleteId);
        System.out.println("Product list after delete: ");
        productManager.displayProduct();

        scanner.close();
    }
}
