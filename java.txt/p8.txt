class p8{
public static void main(String args[]){
java.util.Scanner sc= new java.util.Scanner(System.in);
System.out.println("Enter the Binary number:");
int n=sc.nextInt();
int dec=0,i=0,binary;
while(n!=0){
binary=n%10;
n/=10;
dec +=binary*Math.pow(2,i);
++i;
}
System.out.println(dec);
}
}