package com.product.spring.controller;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.spring.dto.ResponseDTO;
import com.product.spring.model.Product;
import com.product.spring.model.ProductConfigDetails;

/**
 * Handles requests for the Employee service.
 */
@RestController
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	
	
	@RequestMapping(value = ProdRestURIConstants.GET_PRODUCT_DETAILS, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getProductDetails() {
		logger.info("Entry Inside Product Details Rest API");
		
		//Map to store product details, ideally we should use database
		Map<Integer, Product> prodData = new HashMap<Integer, Product>();
		
		Product prod1 = new Product();
		prod1.setId(9999);
		prod1.setName("Samsung");
		prod1.setCost(1000);
		
		prodData.put(1, prod1);
		
		Product prod2 = new Product();
		prod2.setId(8888);
		prod2.setName("RedMi");
		prod2.setCost(2000);
		
		prodData.put(2, prod2);
		
		
		ResponseDTO respDto = new ResponseDTO();
		respDto.setResponseStatusCode(Integer.parseInt(ProdRestURIConstants.SUCCESS_STATUS_CODE));
		respDto.setResponseMessage(ProdRestURIConstants.SUCCESS_MSG);
		respDto.setOutputMessage("Get Product Details Successfully");
		respDto.setProduct(prodData);
		
		return respDto;
		
		
	}
	
	
	@RequestMapping(value = ProdRestURIConstants.GET_PRODUCT_CONFIG_DETAILS, method = RequestMethod.GET)
	public @ResponseBody ResponseDTO getProductConfigDetails() {
		logger.info("Entry Inside Product Config Details Rest API");
		
		//Map to store product config details, ideally we should use database
		Map<Integer, ProductConfigDetails> prodData = new HashMap<Integer, ProductConfigDetails>();
		
		ProductConfigDetails prod1 = new ProductConfigDetails();
		prod1.setColor("White");
		prod1.setSize("12");
		
		prodData.put(1, prod1);
		
		
		ResponseDTO respDto = new ResponseDTO();
		respDto.setResponseStatusCode(Integer.parseInt(ProdRestURIConstants.SUCCESS_STATUS_CODE));
		respDto.setResponseMessage(ProdRestURIConstants.SUCCESS_MSG);
		respDto.setOutputMessage("Get Product Config Details Successfully");
		respDto.setProductConfigDetails(prodData);
		
		return respDto;
		
		
	}
	
}
