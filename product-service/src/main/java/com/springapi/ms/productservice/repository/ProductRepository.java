package com.springapi.ms.productservice.repository;

import com.springapi.ms.productservice.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
