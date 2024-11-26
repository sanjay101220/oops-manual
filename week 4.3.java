public class stud{ private String name; private int roll; 
public stud(){ 
System.out.println("No-arg constructor is invoked"); name=null; roll=0; 
} 
public stud(String name){ 
System.out.println("1 arg constructor is invoked"); this.name=name; roll=0; 
} 
public stud(String name,int roll){ 
System.out.println("2 arg constructor is invoked"); this.name=name; 
this.roll=roll; 
} 
public static void main (String[]args){ 
stud s1=new stud(); stud s2=new 
stud("Rajalakshmi"); stud s3=new 
stud("Lakshmi",101); 
System.out.println("Name ="+s1.name+" , Roll no = "+s2.roll); 
System.out.println("Name ="+s2.name+" , Roll no = "+s2.roll); 
System.out.println("Name ="+s3.name+" , Roll no = "+s3.roll); 
} 
} 
