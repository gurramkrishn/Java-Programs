package objectarray;

import java.util.Arrays;

public class ProductComparisonExample {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
                new Product(1.5, 25.99, 101),
                new Product(2.0, 19.99, 102),
                new Product(1.8, 29.99, 103),
                // Add more products as needed
        };

        // Sort the array of products based on their prices using Arrays.sort
        Arrays.sort(products);

        // Display the sorted products
        System.out.println("Products sorted by price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
