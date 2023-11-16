class p35
{
// Java programme to find surface area of cylinder
public static void main(String args[]){
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter the radius of cylinder:");
double r=s.nextDouble();
double h=s.nextDouble();
double c=2*Math.PI*r*h;
System.out.println("The surface area of Cylinder is :"+c);
}
}