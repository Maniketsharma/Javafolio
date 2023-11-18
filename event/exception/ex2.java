class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class ex2{

    public static void main(String[] args) {
        try {
            int number = 7; // Replace with the desired number
            checkEvenNumber(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number.");
        }
    }
}
