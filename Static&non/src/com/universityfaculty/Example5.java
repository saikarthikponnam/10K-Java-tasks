package com.universityfaculty;

class Faculty{
	static String universityName;
	String facultyName;
	String department;
	
	void showFacultyDetails() {
		System.out.println("University Name : " + universityName);
        System.out.println("Faculty Name : " + facultyName);
        System.out.println("Department : " + department);
        System.out.println("-------------------------");
	}
}

public class Example5 {

	public static void main(String[] args) {
		Faculty.universityName="Stanford University";
		
		Faculty f1=new Faculty();
		f1.facultyName="Dr. Robert Brown";
		f1.department="Computer Science";
		
		Faculty f2=new Faculty();
		f2.facultyName="Dr. Lisa Green";
		f2.department="Physics";
		
		f1.showFacultyDetails();
		f2.showFacultyDetails();
	}

}
