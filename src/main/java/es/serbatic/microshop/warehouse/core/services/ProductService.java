package es.serbatic.microshop.warehouse.core.services;

import es.serbatic.microshop.warehouse.core.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
