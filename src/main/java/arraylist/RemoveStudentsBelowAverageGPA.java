package arraylist;

import java.util.ArrayList;

public class RemoveStudentsBelowAverageGPA {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        // Add some students to the ArrayList
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 4.0));
        studentList.add(new Student("Bob", "Johnson", 2.8));
        studentList.add(new Student("Emily", "Williams", 3.7));

        System.out.println("Original Student List:");
        printStudentList(studentList);

        // Remove students with GPA less than the average GPA
        removeStudentsBelowAverageGPA(studentList);

        System.out.println("\nStudent List after removing students with GPA below average:");
        printStudentList(studentList);
    }

    // Method to remove students with GPA below average
    private static void removeStudentsBelowAverageGPA(ArrayList<Student> students) {
        // Calculate the average GPA
        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / students.size();

        // Remove students with GPA below average
        students.removeIf(student -> student.GPA < averageGPA);
    }

    // Method to print the student list
    private static void printStudentList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }
}
