class p20{
 public static void main(String[] args) {
    
    int divisors;
    
   
    for (int i = 1; i <= 100; i++) {
     
      divisors = 0;
      
      
      for (int j = 2; j <= Math.sqrt(i); j++) {
        
        if (i % j == 0) {
          divisors++;
          break; 
        }
      }
      
      
      if (divisors == 0 && i > 1) {
        
        System.out.println(i);
      }
    }
  }
}