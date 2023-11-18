import java.util.Scanner;
class p50{
public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Prompt the user for the coordinates of the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the distance between the two points
        double distance = calculateDistance(x1, y1, x2, y2);

        // Display the calculated distance
        System.out.printf("The distance between the two points is: %.2f%n", distance);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
