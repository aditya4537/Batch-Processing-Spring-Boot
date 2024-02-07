package com.batch.example.config;

import org.springframework.batch.item.ItemProcessor;

import com.batch.example.model.Product;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		
		double discountPer = item.getDiscount();
		double originalPrice = item.getPrice();
		double discount = (discountPer/100)*originalPrice;
		double finalPrice = (originalPrice - discount);
		item.setDiscountedPrice(finalPrice);
		return item;
	}

}
