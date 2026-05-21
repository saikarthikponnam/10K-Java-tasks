package com.abstraction;

abstract class User {
    String username;
    String email;
    String role;

    public User(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    abstract void accessDashboard();

    public void login() {
        System.out.println("Login successful.");
    }

    public void logout() {
        System.out.println("Logout successful.");
    }

    public void updateProfile() {
        System.out.println("Profile updated successfully.");
    }
}

class Student extends User {
    String[] enrolledCourses;
    int[] grades;

    public Student(String username, String email,
                   String[] courses, int[] grades) {
        super(username, email, "Student");
        this.enrolledCourses = courses;
        this.grades = grades;
    }

    @Override
    void accessDashboard() {
        System.out.print("Accessing student dashboard: Enrolled Courses: ");
        for (int i = 0; i < enrolledCourses.length; i++) {
            System.out.print(enrolledCourses[i]);
            if (i < enrolledCourses.length - 1) System.out.print(", ");
        }

        System.out.print("; Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}

class Instructor extends User {
    String[] createdCourses;
    String[][] submissions; // 2D array

    public Instructor(String username, String email,
                      String[] courses, String[][] submissions) {
        super(username, email, "Instructor");
        this.createdCourses = courses;
        this.submissions = submissions;
    }

    @Override
    void accessDashboard() {
        System.out.print("Accessing instructor dashboard: Created Courses: ");
        for (int i = 0; i < createdCourses.length; i++) {
            System.out.print(createdCourses[i]);
            if (i < createdCourses.length - 1) System.out.print(", ");
        }

        System.out.print("; Student Submissions: ");
        for (int i = 0; i < submissions.length; i++) {
            System.out.print(createdCourses[i] + " - ");
            for (int j = 0; j < submissions[i].length; j++) {
                System.out.print(submissions[i][j]);
                if (j < submissions[i].length - 1) System.out.print(", ");
            }
        }
        System.out.println();
    }
}

class Admin extends User {
    int visitors;
    int courses;
    String[] tools;

    public Admin(String username, String email,
                 int visitors, int courses, String[] tools) {
        super(username, email, "Admin");
        this.visitors = visitors;
        this.courses = courses;
        this.tools = tools;
    }

    @Override
    void accessDashboard() {
        System.out.print("Accessing admin dashboard: Site Analytics - ");
        System.out.print("Visitors: " + visitors + ", Courses: " + courses);

        System.out.print("; User Management Tools: ");
        for (int i = 0; i < tools.length; i++) {
            System.out.print(tools[i]);
            if (i < tools.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}

public class Exampleuser4 {
    public static void main(String[] args) {

        Student s = new Student(
                "student1",
                "student1@example.com",
                new String[]{"Math", "Science"},
                new int[]{90, 85}
        );

        s.login();
        s.accessDashboard();
        s.updateProfile();
        s.logout();

        System.out.println();

        Instructor i = new Instructor(
                "instructor1",
                "instructor1@example.com",
                new String[]{"Math 101"},
                new String[][]{{"Submission 1", "Submission 2"}}
        );

        i.login();
        i.accessDashboard();
        i.updateProfile();
        i.logout();

        System.out.println();

        Admin a = new Admin(
                "admin1",
                "admin1@example.com",
                1000,
                50,
                new String[]{"Add User", "Remove User"}
        );

        a.login();
        a.accessDashboard();
        a.updateProfile();
        a.logout();
    }
}