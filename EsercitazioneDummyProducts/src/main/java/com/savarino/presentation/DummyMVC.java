package com.savarino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.savarino.services.ProductService;

@Controller
public class DummyMVC {

	@Autowired
	ProductService service;
	
	@GetMapping("products")
	public String getProducts(Model m) {
		m.addAttribute("titolo", "Elenco prodotti disponibili");
		m.addAttribute("products", service.getProducts());
//		service.getProducts().forEach(System.out::println);
		return "products";
	}
}
