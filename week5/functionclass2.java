package week5;
import java.util.*;
public class functionclass2 {
    boolean equal(double n1,double n2){ 
        boolean a;
        if(n1==n2){
            a=true;
        }
        else{
            a=false;
        }
        return a;
    }
    public static void main(String[] args) {
        functionclass2 fc=new functionclass2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        double n1= sc.nextDouble();
        System.out.println("Enter num2");
        double n2= sc.nextDouble(); 
        System.out.println(fc.equal(n1,n2));
    }
}
