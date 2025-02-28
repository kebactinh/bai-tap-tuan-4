package bai3;

public class NullConstract extends Contract {
	@Override
	public double calculateSalary() {
		return 0;
	}

	@Override
	public boolean isNull() {
		return true;
	}
}
