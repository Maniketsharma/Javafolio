// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable interface
class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
        // Add code to draw a circle (graphics or console representation)
    }
}

// Rectangle class implementing Drawable interface
class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
        // Add code to draw a rectangle (graphics or console representation)
    }
}

// Triangle class implementing Drawable interface
class Triangle implements Drawable {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
        // Add code to draw a triangle (graphics or console representation)
    }
}

// Main class to test the Drawable interface and shapes classes
public class i6{
    public static void main(String[] args) {
        // Create instances of each shape
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(8, 4);
        Triangle triangle = new Triangle(6, 3);

        // Draw each shape
        drawShape(circle);
        drawShape(rectangle);
        drawShape(triangle);
    }

    // Helper method to draw any shape implementing the Drawable interface
    public static void drawShape(Drawable shape) {
        shape.draw();
    }
}
