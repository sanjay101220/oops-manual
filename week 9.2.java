import java.util.Scanner; 
import java.util.InputMismatchException; 
class prog { public static void 
main(String[] args) { Scanner sc = new 
Scanner(System.in); int length = 
sc.nextInt(); 
// create an array to save user input int[] 
name = new int[length]; int sum = 0; // save 
the total sum of the array. 
/* Define try-catch block to save user input in the array "name" 
If there is an exception then catch the exception otherwise print 
the total sum of the array. */ 
try { for (int i = 0; i < length; i++) { name[i] = 
sc.nextInt(); // save user input in the array 
} 
// Calculate the total sum 
for (int num : name) { 
sum += num; 
} 
// Print the total sum 
System.out.println(sum); 
} catch (InputMismatchException e) { 
System.out.println("You entered bad data."); 
} 
sc.close(); // Close the scanner 
} 
} 
