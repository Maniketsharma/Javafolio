class p17{

public static boolean isEven(int n) {

    return n % 2 == 0;
}


public static void printEven(int start, int end) {

    for (int i = start; i <= end; i++) {

        if (isEven(i)) {

            System.out.print(i + " ");
        }
    }

    System.out.println();
}


public static void main(String[] args) {
   printEven(1, 20);  
}
}
