package es.serbatic.microshop.warehouse.core.services.impl;

import es.serbatic.microshop.warehouse.core.model.Product;
import es.serbatic.microshop.warehouse.core.services.ProductService;
import es.serbatic.microshop.warehouse.repository.db.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return Streamable.of(productRepository.findAll()).stream()
                .map(entity -> {
                    var product = new Product(entity.getId());
                    product.setQuantity(entity.getQuantity());
                    return product;
                })
                .collect(Collectors.toList());
    }
}
