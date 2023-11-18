// Shape interface
interface Shape {
    double getArea();
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of getArea() for Rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of getArea() for Circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of getArea() for Triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

// Main class for testing
public class i1{
    public static void main(String[] args) {
        // Creating instances of Rectangle, Circle, and Triangle
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(8, 12);

        // Displaying the areas of each shape
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
