package ConstructorsVariablesAndAccessModifiers.Constructors;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining: sets default radius to 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display radius and area
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", getArea());
    }
}
