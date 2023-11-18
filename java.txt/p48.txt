public class p48
 {
// write a java code to calculate compound intrest
    public static void main(String[] args) {
java.util.Scanner scan=new java.util.Scanner(System.in);        
System.out.print("Enter the total runs scored: ");
        int total = scan.nextInt();

        System.out.print("Enter the total times dismissed: ");
        int t = scan.nextInt();
        if (t > 0) {
            double batAvg = (double) total / t;
            System.out.println("Batting Average: " + batAvg);
        } else {
            System.out.println("The player has not been dismissed yet, so the batting average is undefined.");
        }

        scan.close();
    }
}


