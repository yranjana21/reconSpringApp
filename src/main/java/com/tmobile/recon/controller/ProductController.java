package com.tmobile.recon.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.Product;
import com.tmobile.recon.service.IProductService;

@RestController
 @CrossOrigin(origins = "http://localhost:3000")
@RequestMapping ("/recon/product")
public class ProductController {
	private static final Log log = LogFactory.getLog(ProductController.class);

	@Autowired
	private IProductService productService;

	// ---------save product----------
	@RequestMapping ("/save")
	public String getAll(@RequestBody Product product) {
		log.info("ProductController::save Product");
		productService.saveProduct(product);
		return "Product saved";
	}

	// -----------get Product list--------
	@RequestMapping ("/getlist")
	public List<Product> getProductList() {
		return productService.getProductList();
	}

	@RequestMapping ("/getnames")
	public List<String> getProductNames() {
		return productService.getProductNames();
	}

}
