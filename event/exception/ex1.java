public class ex1{

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be reached if an exception occurs
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Exception caught: " + e.getMessage());
        }

        // The program continues executing after handling the exception
        System.out.println("Program continues...");
    }

    // A method that throws an exception
    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}
