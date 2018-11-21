package com.tmobile.recon.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmobile.recon.model.Product;
import com.tmobile.recon.service.IProductService;

@RestController
@RequestMapping ("/recon/product")
public class ProductController {
	private static final Log log = LogFactory.getLog(ProductController.class);

	@Autowired
	private IProductService productService;

	// ------save-------
	@RequestMapping (value = "/save", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public String saveProduct(@RequestBody Product product) {

		log.info("ProductController::save Product ");
		productService.saveProduct(product);
		return "Product saved";
	}

	// -----------get Product list--------
	@RequestMapping ("/getProductlist")
	public List<Product> getProductList() {
		return productService.getProductList();
	}

	// --------------- get Product Names
	@RequestMapping ("/getnames")
	public List<String> getProductNames() {
		return productService.getProductNames();
	}

	// -------------------get product List in sorted order
	@RequestMapping ("/getlist")
	public List<Product> getProductListSorted() {
		return productService.getProductListSorted();
	}
}
