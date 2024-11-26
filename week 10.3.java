import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 
public class ReverseArrayList { public 
static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
ArrayList<String> list = new ArrayList<>(); 
int n = scanner.nextInt(); 
for (int i = 0; i < n; i++) { 
String element = scanner.next(); 
list.add(element); 
} 
System.out.println("List before reversing : "); 
System.out.println(list); 
Collections.reverse(list); 
System.out.println("List after reversing : "); 
System.out.println(list); 
} 
} 
