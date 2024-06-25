package week8;
/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/ 
public class AbsractClass {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.calculateArea();
        c.calculatePerimeter();
        Rectangle r=new Rectangle();
        r.calculateArea();
        r.calculatePerimeter();
        Triangle t=new Triangle();
        t.calculateArea();
        t.calculatePerimeter();
        
    }    
}
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
}

class Circle extends Shape{
    int a=3;
    @Override
    public double calculateArea(){
    
        double ar=3.14*a*a;
        System.out.printf("Area of circle: %.2f \n ",ar);
        return ar;

    }
    @Override
    public double calculatePerimeter(){
        double pr=2*3.14*a;
        System.out.println("Perimeter of circle: "+pr);
        return pr;

    }
}

class Rectangle extends Shape{
    int s1=4, s2=5;
    @Override
    public double calculateArea(){
        double ar=s1*s2;
        System.out.println("Area of Rectangle: "+ar);
        return ar;

    }
    @Override
    public double calculatePerimeter(){
        double pr=2*(s1+s2);
        System.out.println("Perimeter of Rectangle: "+pr);
        return pr;

    }

}
class Triangle extends Shape{
    int s1=4, s2=5;
    int b=2,h=3;
    @Override
    public double calculateArea(){
        double ar=(b*h)/2;
        System.out.println("Area of Triangle: "+ar);
        return ar;

    }
    @Override
    public double calculatePerimeter(){
        double pr=s1+s2+b;
        System.out.println("Perimeter of Triangle: "+pr);
        return pr;

    }

}
