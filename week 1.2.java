import java.util.Scanner; import 
java.lang.Math; public class LastDigit{ 
public static void main(String[]args){ 
Scanner s=new Scanner(System.in); 
int a = s.nextInt(); int 
lastDigit=Math.abs(a%10); 
System.out.println(lastDigit); 
} 
}
