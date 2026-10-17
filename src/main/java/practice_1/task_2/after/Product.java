package practice_1.task_2.after;

public class Product {
    private String name;
    private double price;
    private boolean isInStock;
    private int quantity;

    public Product(String name, double price, int quantity, boolean isInstock) {
        this.name = name;
        this.price = price;
        this.isInStock = isInstock;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
