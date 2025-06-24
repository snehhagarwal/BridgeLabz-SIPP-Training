
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    public void displayDetails() {
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }
}
