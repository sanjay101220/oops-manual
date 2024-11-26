import java.util.Scanner; public class 
longdig{ public static void 
main(String[]args){ Scanner sc=new 
Scanner(System.in); 
int n=sc.nextInt(); 
int c = 1,v,seqtemp = 0,seq = 0,countmax = 0; 
int count = 0; while(c <= n){ v = sc.nextInt(); 
if(v >= 0){ countmax= countmax + v; 
seqtemp++; 
} 
else{ 
seqtemp = 0; 
countmax = 0; 
} 
if(seqtemp > seq ){ 
seq = seqtemp; 
count = countmax; 
} 
else if (seq == seqtemp){ 
count = count + countmax; 
} 
c++; } 
if (count == 0) 
System.out.print(-1); 
else 
System.out.print(count); 
} 
}
