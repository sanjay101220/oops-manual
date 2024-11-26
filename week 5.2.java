class College 
{ 
public String collegeName; 
public College(String collegeName) 
{ // initialize the instance variables 
this.collegeName=collegeName; } 
public void admitted() { 
System.out.println("A student admitted in "+collegeName); 
} } class Student extends 
College{ 
String studentName; 
String department; 
public Student(String collegeName, String studentName,String department) { 
// initialize the instance variables 
super(collegeName); 
this.studentName=studentName; 
this.department=department; 
} 
public String toString(){ 
// return the details of the student return "CollegeName : 
"+collegeName+"\n"+"StudentName : 
"+studentName+"\n"+"Department : "+department; 
} 
} 
public class Main { 
public static void main (String[] args) { 
Student s1 = new Student("REC","Venkatesh","CSE"); 
s1.admitted(); 
System.out.println(s1.toString()); 
} 
} 
