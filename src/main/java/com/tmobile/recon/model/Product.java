package com.tmobile.recon.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document (collection = "Product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String productId;

	private String productLogo;

	private String productName;

	private String productDescription;

	private String documentType;

	private String headerPresent;

	private Date createdDate = new Date();

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

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

	public String getHeaderPresent() {
		return headerPresent;
	}

	public void setHeaderPresent(String headerPresent) {
		this.headerPresent = headerPresent;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productLogo=" + productLogo + ", productName=" + productName + ", productDescription=" + productDescription + ", documentType=" + documentType + ", headerPresent=" + headerPresent + ", createdDate=" + createdDate + "]";
	}

}
