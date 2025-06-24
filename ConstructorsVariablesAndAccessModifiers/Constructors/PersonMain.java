package ConstructorsVariablesAndAccessModifiers.Constructors;

public class PersonMain {
    public static void main(String[] args) {
        // Original person using parameterized constructor
        Person original = new Person("Sneha", 22);
        System.out.println("--- Original Person ---");
        original.displayDetails();

        System.out.println();

        // Clone using copy constructor
        Person clone = new Person(original);
        System.out.println("--- Cloned Person ---");
        clone.displayDetails();
    }
}
