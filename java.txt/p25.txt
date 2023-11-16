class p25 {
    public static int add(int a, int b) {
        while (b != 0) {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        int s = add(n1, n2);
        System.out.println("Sum: " + s);
    }
}
