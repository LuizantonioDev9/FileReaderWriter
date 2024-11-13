package model.entities;

public class Product {
    //atr
    private String name;
    private double price;
    private int quantity;

    //constr
    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters e setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //metodo
    public double total() {
        double sum = 0.0;
        sum += quantity * price;
        return sum;
    }
}
