class p37{
//java code to find volumn of cone in java.
public static void main(String args[]){
java.util.Scanner scan= new java.util.Scanner(System.in);
System.out.println("Enter the radius of cone:");
double radius = scan.nextDouble();
System.out.println("Enter the Height of cone :");
double h=scan.nextDouble();
double v=(1.0/3.0)*Math.PI*Math.pow(radius,2)*h;
System.out.println("The volumn of cone is:"+v);
}
}