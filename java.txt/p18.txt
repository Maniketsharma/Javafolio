class p18{

public static int stringToInt(String s) {
  
  try {
        // Return the parsed integer
        return Integer.parseInt(s);
    } catch (NumberFormatException e) {
        // Print the error message and return 0 as a default value
        System.out.println("Invalid input: " + s);
        return 0;
    }
}


public static void main(String[] args) {

    System.out.println(stringToInt("123")); 
    System.out.println(stringToInt("-456"));
    System.out.println(stringToInt("abc")); 
}

}
