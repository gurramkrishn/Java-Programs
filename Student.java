public class Student {
    String name;
    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rama Krishna";
        System.out.println(student.getName());
    }
}
