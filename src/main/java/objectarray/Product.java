package objectarray;

import java.util.Arrays;

public class Product  implements Comparable<Product>
{
    private double weight;
    private double price;
    private int id;

    // Constructor
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getters and Setters (omitted for brevity)

    // Implementation of the compareTo method from the Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their prices
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}

