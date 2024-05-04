package week2;
import java.util.*;

public class task4 {
    public static void main(String[] args) {
        /*complete the task 1 using ternary operator */
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=18;
        String b= (a>num) ?"true":"false";
        System.out.println(b);    
    }
}
