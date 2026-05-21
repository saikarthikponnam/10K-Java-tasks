package com.hospitalpatient;

class Patient {
    static String hospitalName;
    String patientName;
    int age;

    void printDetails() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient Age : " + age);
        System.out.println("-------------------------");
    }
}

public class Example4 {

	public static void main(String[] args) {
		Patient.hospitalName = "City Care Hospital";

        Patient p1 = new Patient();
        p1.patientName = "John Doe";
        p1.age = 45;

        Patient p2 = new Patient();
        p2.patientName = "Emma Watson";
        p2.age = 30;

        p1.printDetails();
        p2.printDetails();
	}

}
