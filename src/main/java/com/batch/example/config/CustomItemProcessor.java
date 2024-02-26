package com.batch.example.config;

import org.springframework.batch.item.ItemProcessor;

import com.batch.example.model.Product;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		
		// calculating the discount
		double discountPer = item.getDiscount();
		double originalPrice = item.getPrice();
		double discount = (discountPer/100)*originalPrice;
		double finalPrice = (originalPrice - discount);
		item.setDiscountedPrice(finalPrice);
		
		// filtering by price
		if(finalPrice < 2000) {			
			return item;
		}
		return null;
	}

}
