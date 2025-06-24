package ConstructorsVariablesAndAccessModifiers.Constructors;

public class CircleMain {
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("--- Default Circle ---");
        defaultCircle.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.5);
        System.out.println("--- Custom Circle ---");
        customCircle.displayDetails();
    }
}


