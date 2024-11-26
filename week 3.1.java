import java.util.Scanner; public class 
digit{ public static void 
main(String[]args){ 
Scanner scanner =new Scanner(System.in); 
int size =scanner.nextInt(); 
int[]inpar=new int[size]; 
for(int i=0;i<size;i++){ 
inpar[i]=scanner.nextInt(); 
} 
int[]dig=new int[size]; 
for(int i=0;i<size;i++){ 
int num=inpar[i]; 
if(i==0){ 
dig[i]=num%10; 
} 
else if (i==1){ 
dig[i]=(num/10)%10; 
} 
else if(i==2){ 
dig[i]=(num/100)%10; 
} 
else if(i==3){ 
dig[i]=(num/1000)%10; 
} 
else if(i==4){ 
dig[i]=(num/10000)%10; 
} else{ 
dig[i]=0; 
} 
} int fin=0; 
for(int digi:dig){ 
fin+=digi*digi; 
} 
System.out.print(fin); 
} 
}
