package com.firstproject.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {

    @GetMapping("/product")
    public String product() {
        return "Hello, Product!";
    }

    @GetMapping("/404")
    public String notFound() {
        return "Page Not Found";
    }

    @PostMapping("/createproduct")
    public String createProduct(String name, String description, double price) {
        // Logic to create a product with the provided name, description, and price
        //calulateprince(price);
        return "Product Created!";
    }


}