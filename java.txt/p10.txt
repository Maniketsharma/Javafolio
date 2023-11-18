class p10{
public static void main(String args[]){
int n=6728;
 int sum = 0;
 
        while (n != 0) {
            sum = sum + n % 10;//main logic of intger compute
            n = n / 10;// role of n integer after calculate
        }
System.out.println("The sum of Integer is :"+sum);
System.out.println("THe n role is :"+n);
}
}