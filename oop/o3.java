public class o3{
    // Attributes
    private double width;
    private double height;

    // Constructor
    public o3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        o3 rectangle = new o3(5.0, 10.0);

        // Calculate area and perimeter
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        // Print the calculated area and perimeter
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
