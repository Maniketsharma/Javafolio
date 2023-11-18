import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ex3{

    public static void main(String[] args) {
        String fileName = "numbers.txt"; // Replace with the desired file name
        try {
            checkNumbers(fileName);
            System.out.println("All numbers are non-positive.");
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    static void checkNumbers(String fileName) throws PositiveNumberException, FileNotFoundException {
        File file = new File(fileName);

        // Check if the file exists
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        // Read the file using Scanner
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int number = scanner.nextInt();

                // Check if the number is positive
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }
        }
    }
}
