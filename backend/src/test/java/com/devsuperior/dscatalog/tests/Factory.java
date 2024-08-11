package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L,"Phone","Good Phone",800.0,"https://img.com/img.png",Instant.parse("2024-03-29T20:50:07.12345Z"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
