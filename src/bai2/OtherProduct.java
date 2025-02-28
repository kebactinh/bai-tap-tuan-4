package bai2;

public class OtherProduct extends Product {

	public OtherProduct(double price) {
		super(price);
	}

	@Override
	public double getSellingPrice() {
		return price;
	}
}
