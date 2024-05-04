package week3;
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of science");
        int science=sc.nextInt();    
        System.out.println("Enter marks of english");    
        int english=sc.nextInt();    
        System.out.println("Enter marks of math");
        int math=sc.nextInt(); 
        double av=(science+math+english)/3;
        if(science<35 || math<35 || english<35){
            System.out.println("FAIL");
        }
        else if(av<60){
            System.out.println("third division");
        }    
        else if(av<70){
            System.out.println("second division");
        }    
        else if(av<80){
            System.out.println("first division");
        }    
        else if(av>=90){
            System.out.println("distinction");
        }    
        else{
            System.out.println("invalid");
        }    
    }
}
