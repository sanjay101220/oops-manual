import java.util.ArrayList; 
import java.util.Scanner; 
public class FirstAndLastElement { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Create an ArrayList 
ArrayList<Integer> numbers = new ArrayList<>();
  int numElements = scanner.nextInt(); 
for (int i = 0; i < numElements; i++) { 
int number = scanner.nextInt(); 
numbers.add(number); 
} 
System.out.println("ArrayList: " + numbers); 
// Get the first element int 
firstElement = numbers.get(0); 
// Get the last element 
int lastElement = numbers.get(numbers.size() - 1); 
// Print the results 
System.out.print("First : " + firstElement); 
System.out.println(", Last : " + lastElement); 
} 
} 
