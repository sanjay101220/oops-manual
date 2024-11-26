// Final class definition 
final class FinalExample { 
// Final variable 
final int MAX_SPEED = 120; // Constant value 
// Final method 
public final void display() { 
System.out.println("The maximum speed is: " + MAX_SPEED + " km/h"); 
} 
} 
// Main class to test the final class public 
class Test { public static void 
main(String[] args) { 
// Create an instance of FinalExample 
FinalExample example = new FinalExample(); 
example.display(); 
// Uncommenting the following line will result in a compile-time error 
// because FinalExample is a final class and cannot be subclassed. // 
class SubclassExample extends FinalExample { } 
System.out.println("This is a subclass of FinalExample."); 
} 
} 
