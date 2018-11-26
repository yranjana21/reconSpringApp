package com.tmobile.recon.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tmobile.recon.model.Product;

@Repository
public interface IProductDao {

	public List<Product> getProductList();

	public void saveProduct(Product product);

	public List<Product> getProductListSorted();

}
