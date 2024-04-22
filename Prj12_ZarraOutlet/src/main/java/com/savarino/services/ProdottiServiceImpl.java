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
import com.google.gson.reflect.TypeToken;
import com.savarino.entities.Prodotto;

@Service
public class ProdottiServiceImpl implements ProdottiService {

	
	@Override
	public List<Prodotto> getProdotti() {
		
		HttpURLConnection connection = null;
		StringBuilder output = new StringBuilder();
		BufferedReader reader;
		String riga;
		
		
		try {
			URL url = new URL("https://fakestoreapi.com/products");
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.setReadTimeout(3000);
			int status = connection.getResponseCode();
			System.out.println("La API di fakestore ha rispsoto: "+status);
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while ((riga = reader.readLine())!=null) {
				output.append(riga);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		Type listaProdotti = new TypeToken<List<Prodotto>>(){}.getType(); //creo tipo dato generico, dato un tipo di dato generico costruisce una forma json per quel tipo di dato
		List<Prodotto> prodotti = gson.fromJson(output.toString(), listaProdotti);
		System.out.println(output.toString());
		return prodotti;
	}

	@Override
	public Prodotto getProdotto() {
		// TODO Auto-generated method stub
		return null;
	}

}
