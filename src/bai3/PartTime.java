package bai3;

public class PartTime extends Contract {
	private final double DEFAULT_PART_TIME_SALARY = 2;

	@Override
	public double calculateSalary() {
		return DEFAULT_PART_TIME_SALARY;
	}
}
