// Java program to count trailing 0s in n! 
import java.io.*; import 
java.util.Scanner; 
class prog { 
// Function to return trailing 
// 0s in factorial of n 
static int findTrailingZeros(int n) 
{ if (n < 0) // Negative Number Edge Case 
return -1; 
// Initialize result 
int count=0; 
// Keep dividing n by powers // 
of 5 and update count for (int i = 
5; n / i >= 1; i*=5 
+= n / i; 
} return count; 
} 
){ count 
// Driver Code 
public static void main(String[] args) 
{ 
Scanner sc= new Scanner(System.in); 
int n=sc.nextInt(); 
int res=findTrailingZeros(n); 
System.out.println(res); 
} 
} 
O
