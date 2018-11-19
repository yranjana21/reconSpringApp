package com.tmobile.recon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document (collection = "Product")
public class Product {

	@Id
	private String productId;

	private String productLogo;

	private String productName;

	private String productDescription;
	
	private String documentType;
	
	private String headerPresent;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductLogo() {
		return productLogo;
	}

	public void setProductLogo(String productLogo) {
		this.productLogo = productLogo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setdocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getHeaderPresent() {
		return headerPresent;
	}

	public void setHeaderPresent(String headerPresent) {
		this.headerPresent = headerPresent;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productLogo=" + productLogo + ", productName=" + productName + ", productDescription=" + productDescription + ", documentType=" + documentType + ", headerPresent=" + headerPresent + "]";
	}

	

	
}
