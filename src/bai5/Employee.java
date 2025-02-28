package bai5;

public class Employee {
	private String name;
	private String id;
	private SalaryStrategy salaryStrategy;

	public Employee(String name, String id, SalaryStrategy salaryStrategy) {
		this.name = name;
		this.id = id;
		this.salaryStrategy = salaryStrategy;
	}

	public double calculateSalary() {
		return salaryStrategy.calculateSalary();
	}
}
