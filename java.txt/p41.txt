class p41{
public static void main(String args[]){
// write a java code to calculate average marks.
java.util.Scanner a=new java.util.Scanner(System.in);
System.out.println("Enter the total subject for your marks = ");
int n=a.nextInt();
double t=0;
for(int i=1; i<=n; i++){
System.out.println("Enter the yours  subject marks = "+i+":");
double m=a.nextDouble();
t +=m;
}
double average=t/n;
System.out.println("Your class in average is = "+average);
a.close();
}
}