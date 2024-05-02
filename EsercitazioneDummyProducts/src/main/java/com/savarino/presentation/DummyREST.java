package com.savarino.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.MyProduct;
import com.savarino.entities.Product;
import com.savarino.services.MyProductService;
import com.savarino.services.ProductService;

@RestController
@RequestMapping("api")
public class DummyREST {

	@Autowired
	ProductService service;
	@Autowired
	MyProductService myservice;
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getProducts() {
		return new ResponseEntity<List<Product>>(service.getProducts(), HttpStatus.OK);

	}
	
	@GetMapping("prodotti")
	public ResponseEntity<List<MyProduct>> getProdotti() {
		return new ResponseEntity<List<MyProduct>>(myservice.getProducts(), HttpStatus.OK);

	}
}
