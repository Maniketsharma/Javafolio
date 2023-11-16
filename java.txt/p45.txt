class p45{
public static void main(String args[]){
//write a java programme to calculate electricity bill.
java.util.Scanner bill=new java.util.Scanner(System.in);
double unit=0.10;
double charges=20.00;
System.out.println(" Enter the number of unit consume in meter:");
double meter=bill.nextDouble();
bill.close();
double electricityBill=charges+(meter*unit);
System.out.println("Your Electricity bill Amount is ="+electricityBill);
}
}