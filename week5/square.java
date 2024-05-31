package week5;

import java.util.Scanner;

public class square {
    public static double squar(double a){
        double number=Math.pow(a,2);
        return number;
    
    }
    public static void main(String[] args) {
        System.out.println("enter Number");
        Scanner sc= new Scanner(System.in);
        double m=sc.nextInt();
        double b=squar(m);
        System.out.println(b);
        sc.close();
    }
    
}
