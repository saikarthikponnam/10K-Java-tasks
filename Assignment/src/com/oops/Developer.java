package com.oops;

public class Developer extends Employee implements Bonus{
	private String programmingLanguage;
	public Developer(String empId, String name, int salary, String programmingLanguage) {
		super(empId, name, salary);
		this.programmingLanguage=programmingLanguage;
	}
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public void displayDetails() {
		System.out.println("----- Developer Details -----");
        System.out.println("Employee ID : " + getEmpId());
        System.out.println("Name        : " + getName());
        System.out.println("Salary      : " + getSalary());
        System.out.println("Language    : " + programmingLanguage);
}
	@Override
	public double calculateBonus() {
		return getSalary() * 0.10;
	}
}