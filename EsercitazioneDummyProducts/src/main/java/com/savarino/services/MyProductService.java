package com.savarino.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.savarino.entities.MyProduct;
import com.savarino.entities.Product;
import com.savarino.repos.MyProductsDAO;

@Service
public class MyProductService {

	@Autowired
	private MyProductsDAO dao;
	
	@Autowired
	private ProductService service;
	
	public void caricaProdotti() {
		for(Product p : service.getProducts()) {
			MyProduct mp = new MyProduct();
			mp.setTitle(p.getTitle());
			mp.setPrice(p.getPrice());
			mp.setBrand(p.getBrand());
			mp.setCategory(p.getBrand());
			mp.setDescription(p.getDescription());
			mp.setDiscountPercentage(p.getDiscountPercentage());
			mp.setImages(p.getImages());
			mp.setRating(p.getRating());
			mp.setStock(p.getStock());
			mp.setThumbnail(p.getThumbnail());
			dao.save(mp);
		}
	
	}
	
	public List<MyProduct> getProducts() {
		return dao.findAll();
	}
}
