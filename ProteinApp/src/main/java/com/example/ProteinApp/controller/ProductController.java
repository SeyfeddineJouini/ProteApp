package com.example.ProteinApp.controller;

import java.util.List;
import javax.validation.Valid;
import com.example.ProteinApp.entities.Product;
import com.example.ProteinApp.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/protein")
public class ProductController {
    @Autowired
    IproductService productv;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> pro = productv.findAllProducts();
        return pro;
    }


    @PostMapping("/addproduct")
    public Product createProduct(@Valid @RequestBody Product product) {
        return productv.saveProduct(product);
    }

}