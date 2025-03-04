package bai3;

public class NullConstract extends Contract {
	private final double DEFAULT_NULL_SALARY = 0;

	@Override
	public double calculateSalary() {
		// Do nothing
		return DEFAULT_NULL_SALARY;
	}

	@Override
	public boolean isNull() {
		return true;
	}
}
