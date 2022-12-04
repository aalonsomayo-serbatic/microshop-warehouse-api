package es.serbatic.microshop.warehouse.api.http;

import es.serbatic.microshop.warehouse.api.http.dto.ProductDTO;
import es.serbatic.microshop.warehouse.core.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> findAll() {
        return productService.findAll().stream()
                .map(product -> {
                    var productDTO = new ProductDTO();
                    productDTO.setId(product.getId());
                    productDTO.setQuantity(product.getQuantity());
                    return productDTO;
                })
                .collect(Collectors.toList());
    }
}
