package week7;
/*TASK
 * make a class Rectangle
 * make 2 atrribetes in double, length and breadth
 * make funtion areaOfRectangle that return length * breadth
 * make a funcrion perdimeterOFRectabgle that return 2(length + breadth)
 * make and object of rectangle and print area and perimeter
 */
public class OOP {
    public static void main(String[] args) {
        
        rectangle r1= new rectangle();
        r1.length=4.0;
        r1.breadth=3.0;
        double r1Area=r1.area();
        System.out.println(r1Area);
        double r1Perimeter= r1.perimeter();
        System.out.println(r1Perimeter);
    }
}
class rectangle{
    double length;
    double breadth;
    double area(){
        double area= length * breadth;
        return area;     
    }
    double perimeter(){
        return 2* (length+breadth);
    }
}