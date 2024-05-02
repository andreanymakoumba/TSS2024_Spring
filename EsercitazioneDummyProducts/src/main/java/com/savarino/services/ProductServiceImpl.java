package com.savarino.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.*;
import com.savarino.entities.Product;
import com.savarino.entities.Response;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {
		HttpURLConnection connection = null;
		StringBuilder output = new StringBuilder();
		BufferedReader reader;
		String riga;
		
		
		try {
			URL url = new URL("https://dummyjson.com/products");
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.setReadTimeout(3000);
			int status = connection.getResponseCode();
			System.out.println("La API di dummyjson ha rispsoto: "+status);
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while ((riga = reader.readLine())!=null) {
				output.append(riga);
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		Response response = gson.fromJson(output.toString(), Response.class);
		
//		for (Product product : response.getProducts()) {
//			System.out.println("Prodotto: " + product.getTitle());
//		}
		List<Product> list = response.getProducts().stream().toList();
		
		
		return list ;
	}
	

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
