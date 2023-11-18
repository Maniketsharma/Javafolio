public class o7{
    // Attributes
    private String color;
    private int duration; // in seconds

    // Constructor
    public o7(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    // Method to change the color
    public void changeColor(String newColor) {
        color = newColor;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Method to get the current color
    public String getColor() {
        return color;
    }

    // Method to get the current duration
    public int getDuration() {
        return duration;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a TrafficLight object with initial values
        o7 trafficLight = new o7("red", 30);

        // Displaying the initial state
        System.out.println("Initial Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Changing the color to green
        trafficLight.changeColor("green");

        // Displaying the updated state
        System.out.println("\nUpdated Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        // Checking if the light is red or green
        System.out.println("\nIs the light red? " + trafficLight.isRed());
        System.out.println("Is the light green? " + trafficLight.isGreen());
    }
}
