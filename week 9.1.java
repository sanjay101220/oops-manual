class prog { 
public static void main(String[] args) { 
int n = 82; 
trynumber(n); 
n = 37; 
trynumber(n); // Call the trynumber(n); 
} 
public static void trynumber(int n) { try { 
checkEvenNumber(n); // Call the checkEvenNumber() 
System.out.println(n + " is even."); 
} catch (Exception e) { // Catch the exception 
System.out.println("Error: " + e.getMessage()); 
} 
} 
public static void checkEvenNumber(int number) { if (number % 2 != 0) { throw new 
RuntimeException(number + " is odd."); // Throw a RuntimeException } 
} 
}
