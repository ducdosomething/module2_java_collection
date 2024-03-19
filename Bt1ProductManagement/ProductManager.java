package Bt1ProductManagement;

import java.util.ArrayList;

public class ProductManager {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(int iD, String name, double price) {
        Product product = new Product(iD, name, price);
        products.add(product);
    }

    public void displayProduct() {
        if (products.isEmpty()) {
            System.out.println("No products available");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public Product searchProductById(int searchId) {
        for (Product product : products) {
            if (product.getiD() == searchId) {
                return product;
            }
        }
        return null;
    }

    public void updateProductById(int searchId, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getiD() == searchId) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
    }

    public void deleteProductById(int deleteId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getiD() == deleteId) {
                products.remove(i);
                return;
            }
        }
    }

}
