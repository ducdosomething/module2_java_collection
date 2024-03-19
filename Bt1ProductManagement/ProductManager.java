package Bt1ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public Product searchProductByName(String searchName) {
        for (Product product : products) {
            if (product.getName().equals(searchName)) {
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

    public void sortProductByPriceAscending() {
        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public void sortProductByPriceDecending() {
        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
    }
}
