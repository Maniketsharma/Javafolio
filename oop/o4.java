public class o4{
    // Attribute
    private double radius;

    // Constructor
    public o4(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
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

    public static void main(String[] args) {
        // Create an instance of the Circle class
        o4 circle = new o4(5.0);

        // Access the radius and print it
        System.out.println("Circle Radius: " + circle.getRadius());

        // Modify the radius
        circle.setRadius(7.5);

        // Print the updated radius
        System.out.println("Updated Circle Radius: " + circle.getRadius());

        // Calculate and print the area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
    }
}
