import java.util.Scanner; 
public class WordReverser { 
public static String reverseWordsWithCase(String sentence, int caseOption) { 
// Split the sentence into words based on spaces 
String[] words = sentence.split(" "); 
// StringBuilder to store the result 
StringBuilder result = new StringBuilder(); 
// Process each word for 
(String word : words) { 
// Reverse the word 
String reversedWord = new StringBuilder(word).reverse().toString(); 
if (caseOption == 0) { 
// If caseOption is 0, no case conversion, just reverse the word 
result.append(reversedWord).append(" "); 
} else if (caseOption == 1) { 
// If caseOption is 1, adjust the case while maintaining original letter 
positions
result.append(applyCaseConversion(reversedWord, word)).append(" "); 
} 
} 
// Remove the trailing space and return the result return 
result.toString().trim(); 
} 
private static String applyCaseConversion(String reversedWord, String 
originalWord) { 
// StringBuilder to store the adjusted word 
StringBuilder adjustedWord = new StringBuilder(); 
// Iterate over each character in the reversed word 
for (int i = 0; i < reversedWord.length(); i++) { char 
reversedChar = reversedWord.charAt(i); char 
originalChar = originalWord.charAt(i); 
if (Character.isLowerCase(originalChar)) { 
// If the original character was lowercase, the reversed character should be 
uppercase adjustedWord.append(Character.toLowerCase(reversedChar)); 
} else if (Character.isUpperCase(originalChar)) { 
// If the original character was uppercase, the reversed character should be 
lowercase adjustedWord.append(Character.toUpperCase(reversedChar)); 
} else { 
// Non-alphabetic characters remain unchanged 
adjustedWord.append(reversedChar); } 
} 
return adjustedWord.toString(); 
} 
public static void main(String[] args) { 
// Create a Scanner object to get input from the user Scanner 
scanner = new Scanner(System.in); 
// Get sentence input from the user 
String sentence = scanner.nextLine(); // 
Get case option input from the user int 
caseOption = scanner.nextInt(); 
// Validate the case option 
if (caseOption != 0 && caseOption != 1) {
  System.out.println("Invalid case option. Please enter 0 or 1."); 
} else { 
// Call the function and print the result 
String result = reverseWordsWithCase(sentence, caseOption); 
System.out.println(result); 
} 
// Close the scanner 
scanner.close(); 
} 
}
