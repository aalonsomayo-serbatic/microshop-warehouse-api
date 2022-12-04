package es.serbatic.microshop.warehouse.repository.db.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
public class ProductEntity {
    @Id
    private String id;
    private String quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
