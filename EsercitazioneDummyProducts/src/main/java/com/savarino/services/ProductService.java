package com.savarino.services;

import java.util.List;

import com.savarino.entities.Product;

public interface ProductService {

	List<Product> getProducts();
	Product getProduct();
	
}
