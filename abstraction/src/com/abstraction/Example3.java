package com.abstraction;

abstract class Employee{
	String employeName;
	String employeeId;
	
	public Employee(String employeName, String employeeId) {
		super();
		this.employeName = employeName;
		this.employeeId = employeeId;
	}
	abstract void calculateSalary();
	void applyLeave() {
		System.out.println("Leave applied successfully.");
	}
	void getDetails() {
		System.out.println("Employee Details: " + employeName + ", ID : " + employeeId);
	}
}
class FullTimeEmployee extends Employee{
	int basePay, benefits;
	
	public FullTimeEmployee(String employeName, String employeeId, int basePay, int benefits) {
		super(employeName, employeeId);
		this.basePay=basePay;
		this.benefits=benefits;
	}
	@Override
	void calculateSalary() {
		System.out.println("Calculating salary: Base pay + benefits = $" + (basePay + benefits));
	}
}
class PartTimeEmployee extends Employee{
	int hourlyRate , hoursWorked;
	public PartTimeEmployee(String employeName, String employeeId, int hourlyRate, int hoursWorked) {
		super(employeName, employeeId);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	void calculateSalary() {
		System.out.println("Calculating salary: Hours worked × rate = $" + (hourlyRate * hoursWorked));
	}
}
class Freelancer extends Employee{
	int projectPayment;
	public Freelancer(String employeName, String employeeId, int projectPayment) {
		super(employeName, employeeId);
		this.projectPayment=projectPayment;
	}
	@Override
	void calculateSalary() {
		System.out.println("Calculating salary: Project payment = $" + projectPayment);
	}
}
public class Example3 {

	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee("John Doe", "12345", 50000, 10000);
		e1.calculateSalary();
		e1.applyLeave();
		e1.getDetails();
		System.out.println();
		
		Employee e2 = new PartTimeEmployee("Jane Smith", "67890", 20, 15);
		e2.calculateSalary();
		e2.applyLeave();
		e2.getDetails();
		System.out.println();
		
		Employee e3 = new Freelancer("Alice Johnson", "54321", 5000);
		e3.calculateSalary();
		e3.applyLeave();
		e3.getDetails();
		System.out.println();
	}
}
