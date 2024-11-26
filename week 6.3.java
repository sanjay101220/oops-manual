import java.util.*; 
public class HelloWorld { public static 
void main(String[] args) { 
Scanner scan = new Scanner(System.in); 
String a = scan.nextLine(); 
String b = scan.nextLine(); 
StringBuffer ab = new StringBuffer(); 
if(a.trim().isEmpty() && b.trim().isEmpty()){ 
System.out.print("null"); 
} 
else{ 
for(int i = 0;i < a.length();i++){ if (a.charAt(i) 
!= ' ') { 
ab.append(Character.toString(a.charAt(i))); } 
} 
for(int i = 0;i < b.length();i++){ if (b.charAt(i) 
!= ' '){ 
ab.append(Character.toString(b.charAt(i))); } 
} 
char[] d = ab.toString().toCharArray(); 
Arrays.sort(d); 
for(int i = d.length - 1;i >= 1;i--){ 
if(d[i] != d[i-1]) 
System.out.print(d[i]); 
} 
System.out.print(d[0]); 
} 
} 
}
