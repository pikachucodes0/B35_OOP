package week4;
import java.util.*;
public class whilecw {
    public static void main(String[] args) {
        System.out.println("Enter negative number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
           System.out.println(" negative number only");
           n=sc.nextInt();
        }
        System.out.println("negative number"+n);
        sc.close();
    }   
}
