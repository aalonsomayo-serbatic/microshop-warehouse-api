package es.serbatic.microshop.warehouse.core.model;

public class Product {
    private final String id;
    private String quantity;

    public Product(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
