import java.util.Scanner; 
public class DecodeString { public static 
void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
String encodedString = scanner.nextLine(); 
StringBuilder decodedString = new StringBuilder(); 
int count = 0; 
for (int i = 0; i < encodedString.length(); i++) { 
if (encodedString.charAt(i) == '0') { 
count++; 
} else { char decodedChar = (char) ('Z' - count 
+ 1); decodedString.append(decodedChar); 
count = 0; 
} 
} 
System.out.println(decodedString.toString()); 
} 
} 
