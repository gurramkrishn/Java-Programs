package collections;

import org.junit.Assert;
import org.junit.Test;
import pojo.Student;

import java.util.ArrayList;

public class StudentDataTest {
    StudentData studentData = new StudentData();

    @Test
    public void testRemoveStudentSuccess() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("ram", "krishna", 3.5));
        students.add(new Student("chandu", "A", 3.1));
        students.add(new Student("Venkat", "B", 3.8));
        students = studentData.removeStudentsByGPA(students);
        Assert.assertEquals(2, students.size());
    }


    @Test
    public void testRemoveStudentFailure() {
        ArrayList<Student> students = new ArrayList<>();
        studentData.removeStudentsByGPA(students);
        Assert.assertTrue(students.isEmpty());
    }
    @Test
    public void testRemoveStudentEdge() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("ram", "krishna", 3.5));
        students.add(new Student("chandu", "A", 3.5));
        students.add(new Student("Venkat", "B", 3.5));
        studentData.removeStudentsByGPA(students);
        Assert.assertEquals(3, students.size());
    }

    @Test
    public void testStudentDataByNameFailure() {
        Student student = studentData.getStudentData("ram");
        Assert.assertNull(student);
    }

    @Test
    public void testStudentDataByNameEdgeCase() {
        Student student = studentData.getStudentData(null);
        Assert.assertNull(student);
    }

}
