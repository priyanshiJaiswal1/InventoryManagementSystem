package com.example.InventoryManagmentSystem.repository;

import com.example.InventoryManagmentSystem.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addProduct(Product product) {
        String sql = "INSERT INTO product(name,quantity,price) VALUES(?,?,?)";

        jdbcTemplate.update(sql,
                product.getName(),
                product.getQuantity(),
                product.getPrice());
    }

    public void updateQuantity(int id, int quantity) {

        String sql = "UPDATE product SET quantity=? WHERE id=?";

        jdbcTemplate.update(sql, quantity, id);
    }

    public void deleteProduct(int id) {

        String sql = "DELETE FROM product WHERE id=?";

        jdbcTemplate.update(sql, id);
    }

    public List<Product> getAllProducts() {

        String sql = "SELECT * FROM product";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price")
                ));
    }

}