package com.tmobile.recon.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;
import com.tmobile.recon.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Import(ProductController.class)
public class ProductControllerTest {
	private static final Log log = LogFactory.getLog(ProductControllerTest.class);

	@Autowired
	private MockMvc mockMvc;

	Product product;
	String json;

	@Test
	public void testSaveProduct() {
		product = new Product();
		product.setProductLogo("productLogo07");
		product.setProductName("Name07");
		product.setProductDescription("Description");
		product.setDocumentType("csv");
		product.setHeaderPresent("Yes");
		json = new Gson().toJson(product);
		try {
			this.mockMvc
					.perform(post("/recon/product/save").accept(MediaType.APPLICATION_JSON)
							.contentType(MediaType.APPLICATION_JSON).content(json))
					.andExpect(status().is4xxClientError()).andDo(print());
			log.info("Test Save Product Done-----");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

	}

}
