package bai3;

public class Employee {
	private Contract constract;

	public Employee(Contract constract) {
		this.constract = constract;
	}

	public double calculateSalary() {
		return constract.calculateSalary();
	}
}
