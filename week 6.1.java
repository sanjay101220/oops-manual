import java.util.*; public class mix{ 
public static void main(String[] args){ 
Scanner scan = new Scanner(System.in); 
String g = scan.nextLine(); int n = 
scan.nextInt(),ones,flag = 0; StringBuffer 
temp = new StringBuffer(); StringBuffer 
temp1 = new StringBuffer(); int space = 
0; while (n > 0){ ones = (n %10) - 1; 
for(int i = 0; i < g.length();i++){ 
if (g.charAt(i) == ' '){ space 
= space + 1; 
} 
else if(space == ones && flag == 0){ 
temp.append(Character.toString(g.charAt(i))); 
} 
else if(space == ones && flag == 1){ 
temp1.append(Character.toString(g.charAt(i))); 
}
