import java.util.Scanner; 
// Abstract class Shape abstract class 
Shape { public abstract double 
calculateArea(); 
} 
// Circle class 
class Circle extends Shape { 
private double radius; 
public Circle(double radius) { 
this.radius = radius; 
} 
@Override
  public double calculateArea() { return Math.PI * radius 
* radius; // Area of circle: πr² } 
} 
// Rectangle class 
class Rectangle extends Shape { 
private double length; private 
double breadth; 
public Rectangle(double length, double breadth) { 
this.length = length; this.breadth = breadth; 
} 
@Override 
public double calculateArea() { return length * breadth; // Area 
of rectangle: length * breadth 
} 
} 
// Triangle class 
class Triangle extends Shape { 
private double base; private 
double height; 
public Triangle(double base, double height) { 
this.base = base; this.height = height; 
} 
@Override 
public double calculateArea() { return 0.5 * base * height; // Area 
of triangle: 0.5 * base * height 
} 
} 
// Main class to test the shapes public 
class ShapeTest { public static void 
main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Input for Circle 
double radius = scanner.nextDouble(); 
Circle circle = new Circle(radius); 
System.out.printf("Area of a circle: %.2f%n", circle.calculateArea()); 
// Input for Rectangle
                 double length = scanner.nextDouble(); 
double breadth = scanner.nextDouble(); 
Rectangle rectangle = new Rectangle(length, breadth); 
System.out.printf("Area of a Rectangle: %.2f%n", rectangle.calculateArea()); 
// Input for Triangle double base = 
scanner.nextDouble(); 
double height = scanner.nextDouble(); 
Triangle triangle = new Triangle(base, height); 
System.out.printf("Area of a Triangle: %.2f%n", triangle.calculateArea()); 
scanner.close(); 
} 
} 
