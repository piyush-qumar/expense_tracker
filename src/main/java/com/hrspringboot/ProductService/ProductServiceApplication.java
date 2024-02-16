package com.hrspringboot.ProductService;

import io.unlogged.Unlogged;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ProductServiceApplication {
	@Unlogged
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
