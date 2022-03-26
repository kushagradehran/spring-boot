package com.tcs.service;

import java.util.List;

import com.tcs.beans.Product;
import com.tcs.exception.ProductNotFoundException;

public interface ProductService {
	public Product store(Product product);
	public Product fetchProductById(int productId) throws ProductNotFoundException;
	public void deleteProductById(int productId) throws ProductNotFoundException;
	public Product updateProductPrice(int productId, int price) throws ProductNotFoundException;
	public List<Product> fetchProducts();
}
