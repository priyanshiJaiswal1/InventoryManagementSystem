package com.example.InventoryManagmentSystem.service;

import com.example.InventoryManagmentSystem.model.Product;

import java.util.List;

    public interface ProductService {

        void addProduct(Product product);

        void updateQuantity(int id, int quantity);

        void deleteProduct(int id);

        List<Product> getAllProducts();
    }

