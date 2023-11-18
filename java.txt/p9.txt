class p9{
public static void main(String at[]){
String javaVersion =System.getProperty("java.version");
if(javaVersion!=null){
System.out.println("Java is install on your pc:"+javaVersion);
}
else{
System.out.println("Java is not  install on your pc:");
}
}
}