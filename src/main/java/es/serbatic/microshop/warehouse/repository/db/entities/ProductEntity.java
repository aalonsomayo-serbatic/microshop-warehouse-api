package es.serbatic.microshop.warehouse.repository.db.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
public class ProductEntity {
    @Id
    private String id;
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
