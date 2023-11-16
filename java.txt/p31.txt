import java.util.Scanner;

class p31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first diagonal: ");
        double d1 = scanner.nextDouble();

        System.out.print("Enter the length of the second diagonal: ");
        double d2 = scanner.nextDouble();

        if (d1 < 0 || d2 < 0) {
            System.out.println("Both diagonal lengths must be non-negative values.");
        } else {
            double area = (d1 *d2) / 2;
            System.out.println("The area of the rhombus is: " + area);
        }
    }
}
