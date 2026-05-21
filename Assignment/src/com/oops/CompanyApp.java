package com.oops;

public class CompanyApp {

	public static void main(String[] args) {
		Employee d = new Developer("101", "karthik", 50000, "java");
        Manager m = new Manager("201", "Rahul", 80000, 10);
        
        Employee[] employees = {d, m};
        
        for(Employee emp : employees) {
        	emp.displayDetails();
        	
        	Bonus b = (Bonus) emp;
        	System.out.println("Bonus       : " + b.calculateBonus());

            System.out.println();
        }

	}

}
