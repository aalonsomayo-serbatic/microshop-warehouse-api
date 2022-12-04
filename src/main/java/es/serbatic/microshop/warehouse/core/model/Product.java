package es.serbatic.microshop.warehouse.core.model;

public class Product {
    private final String id;
    private int quantity;

    public Product(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
