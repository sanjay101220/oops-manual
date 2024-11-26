import java.util.Scanner; 
class fibo3{ int a; int b; 
int c; 
fibo3(int a,int b,int c){ 
this.a = a; this.b = 
b; this.c = c; 
} 
int nth(int x){ 
if (x == 1){ 
return 0; 
} 
else if(x == 2 && x == 3) 
return 1; 
else{ int temp1,temp2,temp; int 
count = 4; while(x >= 
count){ temp = 
this.a+this.b+this.c; 
temp1 = this.c; 
this.c = temp; 
temp2 = this.b; 
this.b = temp1; 
this.a = temp2; 
count++; 
} 
return this.c; 
} 
} 
} 
public class Main{ public static void 
main(String[] args){ Scanner s = new 
Scanner(System.in); 
int t = s.nextInt(); fibo3 r 
= new fibo3(0,1,1); 
System.out.print(r.nth(t)); 
} 
} 
