abstract class GeometricShape {
/*
Topic = Inheritence 
prog.no 26.write a programme to create an abstract class GeomatricShape with abstract method 
area() and perimeter(). create subclass Triangle and Square that extends the GeomatricShape class and implement the respective methode to calculate area and perimeter of each shape.  */

    public abstract double area();
    public abstract double perimeter();
}

 
class Triangle extends GeometricShape {
    private double b;
    private double h;
    private double l1;
    private double b2;
    private double h3;

    public Triangle(double b, double h, double l1, double b2, double h3) {
        this.b = b;
        this.h = h;
        this.l1 = l1;
        this.b2 = b2;
        this.h3 = h3;
    }

    @Override
    public double area() {
        return 0.5 * b * h;
    }

    @Override
    public double perimeter() {
        return l1+ b2 + h3;
    }
}

class Square extends GeometricShape {
    private double s;

    public Square(double s) {
        this.s = s;
    }

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return 4 * s;
    }
}

public class Inheritence7104prog26 {
    public static void main(String[] args) {
        Triangle t = new Triangle(6, 4, 3, 4, 5);
        Square sq = new Square(4);

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());

        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());
    }
}
