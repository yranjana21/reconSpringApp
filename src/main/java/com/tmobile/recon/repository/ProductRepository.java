package com.tmobile.recon.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByCreatedDate(Date sort);
}