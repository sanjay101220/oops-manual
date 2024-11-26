import java.util.Scanner; public 
class res{ public static 
int[]pa(int[]arr){ 
int maxs=Integer.MIN_VALUE; 
for (int num:arr){ 
if(num>maxs){ 
maxs=num; 
} 
} 
for(int i=0;i<arr.length;i++){ arr[i]=(arr[i]
maxs)*maxs; 
} 
return arr; 
} 
public static void main(String[]args){ 
Scanner scanner =new Scanner (System.in); 
int n=scanner.nextInt(); 
int[]arr=new int[n]; for(int 
i=0;i<n;i++){ 
arr[i]=scanner.nextInt(); 
} 
int[]res=pa(arr); 
for(int i=0;i<n;i++){ 
System.out.print(res[i]+" "); 
} 
scanner.close(); 
} 
} 
