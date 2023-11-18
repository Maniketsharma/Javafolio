class p19{
public static void main(String args[]){
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("Enter the number for conversion of Sec:");
int n=sc.nextInt();
System.out.println("//-----------------++++++TIME CONVERTOR SEC TO MINUTS/HOURS/SECONDS+++++++-----------------------//");
System.out.println("Number of Hours = "+n % (24 * 3600)/ 3600 );
System.out.println("Number of Minutes = "+n % (24 * 3600 * 3600)/ 60 ); 
System.out.println("Number of Seconds = "+n % (24 * 3600 * 3600 * 60)/60);

}
}