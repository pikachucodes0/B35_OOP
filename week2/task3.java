package week2;
import java.util.*;
public class task3 {
    public static void main(String[] args) {
    /*WAP to print the area and perimeter of rectangle 
    area = length*breadth
    perimeter = 2 (length+breadth)*/ 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length");
        int l=sc.nextInt();
        System.out.println("Enter Breadth");
        int b=sc.nextInt();
        int a=l*b;
        int p=2*(l+b);
        System.out.printf("Perimeter is %d\n Area is %d",a,p);
    }
    
}
