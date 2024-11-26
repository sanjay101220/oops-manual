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
} space = 
0 ; flag = 
1; n = n 
/10; 
} 
rew m = new rew(); 
System.out.println(m.r(temp1.toString()) + " " + m.r(temp.toString())); 
} 
} 
class rew{ 
String r(String a){ int le 
= a.length(),n,q; 
StringBuffer temp3 = new StringBuffer(); 
if(le % 2 == 1){ 
n = ((int)(le/2)); 
q = ((int)(le/2)); 
} else{ n = 
((int)(le/2)) - 1; 
q = ((int)(le/2)); 
} 
for(int i = n;i >= 0;i--){ temp3.append(Character.toString(a.charAt(i))); 
} for(int i = q;i < le;i++){ 
temp3.append(Character.toString(a.charAt(i))); 
} 
return temp3.toString(); 
} 
} 
