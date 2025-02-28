package bai5;

public class FullTimeEmployee implements SalaryStrategy {
	private double monthlySalary;

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}
