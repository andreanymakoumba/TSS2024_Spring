package com.savarino.entities;

import java.util.List;

public class Response {
	
    private List<Product> products;
    private int total;
    private int skip;
    private int limit;
    
    public List<Product> getProducts() {
        return products;
    }

}