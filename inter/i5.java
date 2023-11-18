// Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to: " + width);
        } else {
            System.out.println("Invalid width value.");
        }
    }

    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to: " + height);
        } else {
            System.out.println("Invalid height value.");
        }
    }

    // Additional methods specific to Rectangle
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

// Main class to test the Resizable interface and Rectangle class
public class i5{
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(10, 5);

        // Display the original dimensions
        System.out.println("Original Dimensions:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());

        // Resize the width and height
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        // Display the new dimensions
        System.out.println("\nResized Dimensions:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
    }
}
