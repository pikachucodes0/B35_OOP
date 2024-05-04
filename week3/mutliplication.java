import java.util.*;
public class mutliplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        for(int i=0;i<11;i++){
            System.out.println(num+"*"+i+"="+(i*num));
        }
    }
}
