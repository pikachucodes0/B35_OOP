package week4;

public class jump {
    public static void main(String[] args) {
        /*Loop from -5 to 5 
         * break loop if value is positive
         */
        for(int i=-5;i<6;i++){
            if(i>0){
                break;
            }
            System.out.println(i);
        }
        /*Loop from 1 to 20 print number if only even 
         * use continue
        */
        for(int i=1;i<21;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
