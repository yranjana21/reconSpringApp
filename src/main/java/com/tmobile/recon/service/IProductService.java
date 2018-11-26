package com.tmobile.recon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tmobile.recon.model.Product;

@Service
public interface IProductService {

	public List<Product> getProductList();

	public List<String> getProductNames();

	public void saveProduct(Product product);

	public List<Product> getProductListSorted();

}