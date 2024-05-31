package week5;

import java.util.Scanner;

public class eligible {
    public static String checkEligible(String name,int age){
        if(age<0 || age>200){
            System.out.printf("Hello %s, Invalid age",name);
        }
        if(age<18){
            System.out.printf("Sorry %s , you are not eligible",name);
        }
        else{
            System.out.printf("Congratulation %s , You are eligible",name);
        }
            return "invalid";

        }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String n=sc.nextLine();
        System.out.println("enter age");
        int a=sc.nextInt();
        String b= checkEligible(n,a);
        System.out.println(b);

    }
    
}
