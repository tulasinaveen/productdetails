package com.product.spring.dto;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.product.spring.model.*;


public class ResponseDTO implements Serializable {

	private int responseStatusCode;
	private String responseMessage;
	private String outputMessage;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Map<Integer, Product> product;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Map<Integer, ProductConfigDetails> productConfigDetails;

	public int getResponseStatusCode() {
		return responseStatusCode;
	}

	public void setResponseStatusCode(int responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getOutputMessage() {
		return outputMessage;
	}

	public void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}

	public Map<Integer, Product> getProduct() {
		return product;
	}

	public void setProduct(Map<Integer, Product> product) {
		this.product = product;
	}

	public Map<Integer, ProductConfigDetails> getProductConfigDetails() {
		return productConfigDetails;
	}

	public void setProductConfigDetails(Map<Integer, ProductConfigDetails> productConfigDetails) {
		this.productConfigDetails = productConfigDetails;
	}

}
