package com.example.InventoryManagmentSystem.service;

import com.example.InventoryManagmentSystem.model.Product;
import com.example.InventoryManagmentSystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ProductServiceImpl implements ProductService {

        private final ProductRepository repository;

        public ProductServiceImpl(ProductRepository repository) {
            this.repository = repository;
        }

        @Override
        public void addProduct(Product product) {
            repository.addProduct(product);
        }

        @Override
        public void updateQuantity(int id, int quantity) {
            repository.updateQuantity(id, quantity);
        }

        @Override
        public void deleteProduct(int id) {
            repository.deleteProduct(id);
        }

        @Override
        public List<Product> getAllProducts() {
            return repository.getAllProducts();
        }
    }

