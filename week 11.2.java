import java.util.HashSet; 
import java.util.Scanner; 
import java.util.Set; 
public class CompareSets { public static 
void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Read the size of the first set 
int size1 = Integer.parseInt(scanner.nextLine()); 
// Create a HashSet to store the first set of elements 
Set<String> set1 = new HashSet<>(); 
// Read elements for the first set 
for (int i = 0; i < size1; i++) { 
set1.add(scanner.nextLine()); 
} 
// Read the size of the second set
int size2 = Integer.parseInt(scanner.nextLine()); 
// Create a HashSet to store the second set of elements 
Set<String> set2 = new HashSet<>(); 
// Read elements for the second set 
for (int i = 0; i < size2; i++) { 
set2.add(scanner.nextLine()); 
} 
// Retain common elements using the retainAll() method 
set1.retainAll(set2); 
// Print the common elements 
for (String element : set1) { 
System.out.println(element); 
} 
scanner.close(); 
} 
}                           
