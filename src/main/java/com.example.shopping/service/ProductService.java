package com.example.shopping.service;

import com.example.shopping.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return Arrays.asList(
            new Product(1, "Laptop", 999.99),
            new Product(2, "Phone", 499.99),
            new Product(3, "Tablet", 299.99)
        );
    }
}
