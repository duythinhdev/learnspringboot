package com.tutorial.api.controllers;

import com.tutorial.api.models.Product;
import com.tutorial.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {

    @Autowired
    private ProductRepository repository;


    @GetMapping("/getAllProducts")
    //
    List<Product> getAllProducts() {

//        return List.of(new Product(2,"Macbook",2020, 2400.0, ""),new Product(2,"Macbook",2021, 599.0, ""));
        return repository.findAll();
    }
}
