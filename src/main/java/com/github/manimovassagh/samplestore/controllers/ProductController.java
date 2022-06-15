package com.github.manimovassagh.samplestore.controllers;

import com.github.manimovassagh.samplestore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.github.manimovassagh.samplestore.entities.Product;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    
    @Autowired
       private ProductRepository repository;


    @GetMapping("/")
    public String testProduct(){
        return "Just a test";
    }

    @GetMapping("/all")
    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Optional<Product> findProduct(@PathVariable(name="id") String id){
        return repository.findById( id);
    }

    @RequestMapping(value = "/products",method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product){
        repository.save(product);
    }



}
