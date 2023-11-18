import java.util.Scanner;
class p33 {
    public static void main(String[] args) {
        double l =100;
 double w =300;
        double h = 120;

        if (l < 0 || w < 0 || h < 0) {
            System.out.println("All dimensions must be non-negative values.");
        } else {
            double area = 2 * (l * w + w * h+ h * l);
System.out.println("The surface area of the rectangular prism is: " + area);
    }
    }
}
