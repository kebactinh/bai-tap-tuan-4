package bai2;

public class Electronic extends Product {
	private final double DISCOUNT = 0.9;
	private final int MIN_QUANTITY = 10;
	private int quantity;

	public Electronic(double price, int quantity) {
		super(price);
		this.quantity = quantity;
	}

	@Override
	public double getSellingPrice() {
		return hasBulkDiscount() ? price * DISCOUNT : price;
	}

	private boolean hasBulkDiscount() {
		return quantity > MIN_QUANTITY;
	}
}
