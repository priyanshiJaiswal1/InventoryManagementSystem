package com.example.InventoryManagmentSystem.controler;

import com.example.InventoryManagmentSystem.model.Product;
import com.example.InventoryManagmentSystem.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public String addProduct(@RequestBody Product product) {

        service.addProduct(product);

        return "Product Added Successfully";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id,
                         @RequestParam int quantity) {

        service.updateQuantity(id, quantity);

        return "Quantity Updated";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {

        service.deleteProduct(id);

        return "Deleted Successfully";
    }

    @GetMapping
    public List<Product> getAllProducts() {

        return service.getAllProducts();
    }
}