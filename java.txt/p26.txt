class p26 {
    public static void main(String[] args) {
        int number = 89;

        // Ensure the input is positive
        if (number < 0) {
            return;
        }

        int sum = 0;

        // Loop through each digit of the number and add it to the sum
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
