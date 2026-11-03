
package org.example;

public class App {

    public static void main(String[] args) {

        String studentName = "Tisha";
        int marks = 85;

        System.out.println("Student Management System");
        System.out.println("-------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    public String getGreeting() {
        return "Welcome to Student Management System!";
    }
}
