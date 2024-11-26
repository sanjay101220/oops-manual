import java.util.Scanner; 
public class ExceptionHandlingExample { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Read the size of the array 
int size = scanner.nextInt(); 
// Initialize the array int[] 
numbers = new int[size]; 
// Read the elements into the array 
for (int i = 0; i < size; i++) { 
numbers[i] = scanner.nextInt(); 
} 
try { 
// Attempt to perform division 
int result = numbers[0] / numbers[1]; // This may cause an ArithmeticException 
} catch (ArithmeticException e) { 
System.out.println(e); // Catch division by zero 
} catch (ArrayIndexOutOfBoundsException e) { 
System.out.println(e); // Catch accessing out of bounds 
} catch (Exception e) { 
System.out.println(e); // Catch any other exceptions
  } finally { 
// This block is always executed 
} 
try { 
// Attempt to access an out-of-bounds index 
int outOfBoundsValue = numbers[3]; // This will trigger 
ArrayIndexOutOfBoundsException if size < 4 
} catch (ArrayIndexOutOfBoundsException e) { 
System.out.println(e); 
} finally { 
// This block is always executed for the second try 
System.out.println("I am always executed"); 
} 
scanner.close(); 
} 
} 
