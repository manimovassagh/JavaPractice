package com.github.manimovassagh.samplestore.repositories;

import com.github.manimovassagh.samplestore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product, String> {

}