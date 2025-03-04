package bai3;

public class FullTime extends Contract {
	private final double DEFAULT_FULL_TIME_SALARY = 1;

	@Override
	public double calculateSalary() {
		return DEFAULT_FULL_TIME_SALARY;
	}
}
