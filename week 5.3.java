class mob{ 
mob(){ 
System.out.println("Basic Mobile is Manufactured"); 
} 
void basmob(){ 
System.out.println("Basic Mobile is Manufactured"); 
} 
} 
class cam extends 
mob{ cam(){ 
super(); 
System.out.println("Camera Mobile is Manufactured"); 
} 
void newm(){ 
System.out.println("Camera Mobile with 5MG px"); 
} 
} 
class and extends 
cam{ and(){ 
super(); 
System.out.println("Android Mobile is Manufactured"); 
} 
void andmob(){ 
System.out.println("Touch Screen Mobile is Manufactured"); 
} 
} public class Main{ public static 
void main(String[]args){ and 
andmob=new and(); andmob.newm(); 
andmob.andmob(); 
} 
}
