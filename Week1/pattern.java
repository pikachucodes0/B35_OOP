package Week1;
public class pattern {
    public static void main(String[] args) {
    /*4. WAP that prints the following pattern:

    *

    **

    ***

    ****/
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
