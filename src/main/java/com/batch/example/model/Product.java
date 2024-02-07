package com.batch.example.model;

public class Product {

	private int productId;
	
	private String title;
	
	private String description;
	
	private int price;
	
	private int discount;
	
	private double discountedPrice;
	
	

	public Product(int productId, String title, String description, int price, int discount) {
		super();
		this.productId = productId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.discount = discount;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double finalPrice) {
		this.discountedPrice = finalPrice;
	}
	
	
}
