package com.ty;

import org.springframework.stereotype.Component;

@Component(value="myProduct")
public class Product {

	public void quality() {
		System.out.println("product is good");
	}
}
