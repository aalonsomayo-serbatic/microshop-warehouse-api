package es.serbatic.microshop.warehouse.repository.db;

import es.serbatic.microshop.warehouse.repository.db.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
}
