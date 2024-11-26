import java.util.HashSet; 
import java.util.Scanner; 
public class Prog { public static void 
main(String[] args) { 
Scanner sc = new Scanner(System.in); 
// Read the number of elements 
int n = sc.nextInt();
  // Create a HashSet object to store numbers 
HashSet<Integer> numbers = new HashSet<>(); 
// Add numbers to the HashSet 
for (int i = 0; i < n; i++) { 
numbers.add(sc.nextInt()); 
} 
// Read the search key 
int skey = sc.nextInt(); 
// Check if skey is present in the HashSet 
if (numbers.contains(skey)) { 
System.out.println(skey + " was found in the set."); 
} else { 
System.out.println(skey + " was not found in the set."); 
} 
// Close the scanner 
sc.close(); 
} 
} 
