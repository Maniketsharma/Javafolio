class p24 {
    public static void main(String[] args) {
        int n = 12321;
        if (n > 0) {
            if (isP(n)) {
                System.out.println(n + " is a positive palindrome number.");
            } else {
                System.out.println(n + " is a positive number, but not a palindrome.");
            }
        } else {
            System.out.println(n + " is not a positive number.");
        }
    }

    public static boolean isP(int num) {
        int o = num;
        int r = 0;

        while (num > 0) {
            int d = num % 10;
            r = r * 10 + d;
            num /= 10;
        }

        return o == r;
    }
}
