package systementor.fakestoreservice.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import systementor.fakestoreservice.model.Product;
import systementor.fakestoreservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/fetch")
    public List<Product> fetchProducts() {
         return service.fetchAndSaveProducts();
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

}
