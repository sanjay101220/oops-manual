import java.util.Scanner; public class 
SequenceGenerator{ public static void 
main(String[]args){ Scanner S = new 
Scanner(System.in); 
int n = S.nextInt(); 
String term = generateTerm(n); 
System.out.print(term); 
} 
private static String generateTerm(int n){ 
if (n==1){ return "1"; 
} 
String prevTerm = generateTerm (n-1); 
StringBuilder currentTerm = new StringBuilder(prevTerm);
