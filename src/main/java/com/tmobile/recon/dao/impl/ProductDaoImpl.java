package com.tmobile.recon.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tmobile.recon.dao.IProductDao;
import com.tmobile.recon.model.Product;
import com.tmobile.recon.repository.ProductRepository;

@Repository
public class ProductDaoImpl implements IProductDao {
	private static final Log log = LogFactory.getLog(ProductDaoImpl.class);

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getProductList() {
		log.info("ProductDaoImpl :: Get product List");
		return productRepository.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		
		productRepository.save(product);
	}

}
