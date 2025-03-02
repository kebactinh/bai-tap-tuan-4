package bai1;

import java.time.LocalDate;

public class Customer {
	private LocalDate joinDate;

	private boolean isVipCustomer;

	private int purchaseAmount;

	public Customer(LocalDate joinDate, boolean isVipCustomer, int purchaseAmount) {
		this.joinDate = joinDate;
		this.isVipCustomer = isVipCustomer;
		this.purchaseAmount = purchaseAmount;
	}

	/**
	 * @return the joinDate
	 */
	public LocalDate getJoinDate() {
		return joinDate;
	}

	/**
	 * @return the isVipCustomer
	 */
	public boolean isVipCustomer() {
		return isVipCustomer;
	}

	/**
	 * @return the purchaseAmount
	 */
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
}
