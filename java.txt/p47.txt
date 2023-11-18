class p47{
//Java programme to calculate compound intrest.
public static void main(String args[]){
double amount=11.23;
double rate=34.2;
double time =19.05;
int n=5;
System.out.println("Principal Amount is:"+amount);
System.out.println("Principal Amount  Rate is:"+rate);
System.out.println("Time in year:"+time);
System.out.println("Time intrest in per year:"+n);
 double total=amount*Math.pow(1+(rate/n),n*time);
double compundIntrest =total-amount;

System.out.println("The Coumpunt of intrest is="+compundIntrest);
}
}