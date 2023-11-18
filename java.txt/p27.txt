 class p27 {
    public static void main(String[] args) {
        double r = 45.23;
        if (r < 0) {
            System.out.println("Radius cannot be negative. Please enter a non-negative value.");
        } else {
            double area = Math.PI * Math.pow(r, 2);
            System.out.println("The area of the circle is: " + area);
        }
    }
}
