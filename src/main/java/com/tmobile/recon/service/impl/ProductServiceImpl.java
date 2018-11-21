package com.tmobile.recon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmobile.recon.dao.IProductDao;
import com.tmobile.recon.model.Product;
import com.tmobile.recon.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	private static final Log log = LogFactory.getLog(ProductServiceImpl.class);

	@Autowired
	IProductDao productDao;

	@Override
	public List<Product> getProductList() {
		log.info("ProductServiceImpl :: getProductList");
		return productDao.getProductList();

	}

	@Override
	public void saveProduct(Product product) {
		productDao.saveProduct(product);
	}

	@Override
	public List<String> getProductNames() {
		List<Product> productList = productDao.getProductList();
		List<String> productNames = new ArrayList<>();
		for (Product product : productList){
			productNames.add(product.getProductName());
		}
		return productNames;
	}

	@Override
	public List<Product> getProductListSorted() {
		return productDao.getProductListSorted();
	}

}
