package com.github.manimovassagh.samplestore.configs;

import com.github.manimovassagh.samplestore.entities.Product;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Product ProductService() {
        return new Product();
    }



}
