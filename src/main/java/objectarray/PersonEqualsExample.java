package objectarray;

public class PersonEqualsExample {
    public static void main(String[] args) {
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(180.0, 75.0, "123-45-6789", "987-654-3210");

        // Check equality based on SSN
        System.out.println("Persons are equal based on SSN: " + person1.equals(person2));
    }
}
