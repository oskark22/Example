package ie.atu.week5;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather information on the first student
        System.out.println("Please enter the name of the first student: ");
        String name = input.nextLine();

        System.out.println("\nPlease enter the email of the first student: ");
        String eMail = input.nextLine();

        System.out.println("\nPlease enter the course of the first student: ");
        String myCourse = input.nextLine();

        // First instance of Student class
        Student first_Student = new Student();
        first_Student.setName(name);
        first_Student.seteMail(eMail);
        first_Student.setMyCourse(myCourse);
    }
}
