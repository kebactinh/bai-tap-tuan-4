package bai2;

public class Fashion extends Product {
	private final double DISCOUNT = 1.1;

	private boolean isNewSeason;

	public Fashion(double price, boolean isNewSeason) {
		super(price);
		this.isNewSeason = isNewSeason;
	}

	@Override
	public double getSellingPrice() {
		return isNewSeasonDiscount() ? price * DISCOUNT : price;
	}

	private boolean isNewSeasonDiscount() {
		return isNewSeason;
	}
}
