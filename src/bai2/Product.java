package bai2;

public abstract class Product {
	protected double price;

	public Product(double price) {
		this.price = price;
	}

	public abstract double getSellingPrice();
}
