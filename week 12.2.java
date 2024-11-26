import java.util.HashSet; import 
java.util.Set; public class 
CommonAlphabetSum { 
public static int singleDigitSum(int num) { 
int sum = 0; 
while (num > 0) { 
sum += num % 10; 
num /= 10; 
} 
if (sum > 9) { return 
singleDigitSum(sum); } 
return sum; 
} 
public static int calculateCommonAlphabetSum(char[] input1, char[] input2) { 
Set<Character> set1 = new HashSet<>(); for (char c : input1) { set1.add(c); 
} 
int sum = 0; for 
(char c : input2) { 
if (set1.contains(c)) { 
sum += c; 
} 
} 
return singleDigitSum(sum); 
} 
public static void main(String[] args) 
{ char[] input1 = {'a', 'b', 'c'}; 
char[] input2 = {'b', 'c', 'd'}; 
int result = calculateCommonAlphabetSum(input1, input2); 
System.out.println(result); } 
} 
