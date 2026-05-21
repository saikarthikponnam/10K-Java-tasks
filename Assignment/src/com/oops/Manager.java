package com.oops;

public class Manager extends Employee implements Bonus{
	private int teamSize;
	public Manager(String empId, String name, int salary, int teamSize) {
		super(empId, name, salary);
		this.teamSize=teamSize;
	}
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public void displayDetails() {
		System.out.println("----- Manager Details -----");
        System.out.println("Employee ID : " + getEmpId());
        System.out.println("Name        : " + getName());
        System.out.println("Salary      : " + getSalary());
        System.out.println("Team Size   : " + teamSize);
}
	@Override
	public double calculateBonus() {
		return getSalary() * 0.20;
	}

}
