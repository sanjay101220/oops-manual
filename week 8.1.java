import java.util.Scanner; public 
class VowelStringExtractor { 
// Method to extract strings with vowels as first and last characters 
public static String extractVowelStrings(String[] stringArray) { 
StringBuilder result = new StringBuilder(); 
String vowels = "aeiouAEIOU"; // String containing all vowels 
// Iterate through the array of strings 
for (String s : stringArray) { 
// Check if the string is not empty and if both the first and last characters are vowels 
if (s.length() > 0 && vowels.indexOf(s.charAt(0)) != -1 && 
vowels.indexOf(s.charAt(s.length() - 1)) != -1) { result.append(s); // Append matching 
string to the result } 
} 
// Return the concatenated string in lowercase or "no matches found" 
return result.length() > 0 ? result.toString().toLowerCase() : "no matches found"; } 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Input for the number of strings 
int n = scanner.nextInt(); 
scanner.nextLine(); // Consume the newline character 
// Input for the strings in one line 
String input = scanner.nextLine(); 
String[] strings = input.split(" "); // Split input into an array 
// Process and output the result 
String result = extractVowelStrings(strings); 
System.out.println(result); 
scanner.close(); // Close the scanner 
} 
} 
