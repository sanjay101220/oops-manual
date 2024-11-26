import java.util.*; class diff{ char different(char 
a, char b){ if ((int)a != (int)b) return 
(char)((int)'a' + ((int)a-(int)b) - 1); 
return a; 
} 
} 
public class Main{ public static void 
main(String[] args){ Scanner scan = new 
Scanner(System.in); 
diff z = new diff(); 
String q = scan.nextLine(); 
StringBuffer ans = new StringBuffer(); 
StringBuffer temp = new 
StringBuffer(); for(int i = 0;i < 
q.length();i++){ if(q.charAt(i) == ':'){ 
temp.append(" "); 
} else{ 
temp.append(Character.toString(q.charAt(i))); }
                } 
String h = temp.toString(); for(int i 
= 0;i < temp.length();i++){ if(i%3 
== 0){ 
ans.append(Character.toString(z.different(h.charAt(i),h.charAt(i+1)))); 
} 
} 
System.out.print(ans.toString().toUpperCase()); 
} 
} 
