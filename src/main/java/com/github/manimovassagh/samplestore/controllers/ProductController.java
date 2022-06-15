package com.github.manimovassagh.samplestore.controllers;

import com.github.manimovassagh.samplestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.manimovassagh.samplestore.entities.Product;

import java.util.List;

@RestController
public class ProductController {
    
    @Autowired
    private Product product;
    private ProductRepository repository;


    @GetMapping("/")
    public String testProduct(){
        return "Just a test";
    }

}
