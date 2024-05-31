package week6;
//finding an element in a array using while loop
public class ArrayLoop {
    public static void main(String[] args) {
        String[] arr={"jogn","doe","joe","bhatti"};
        int i=0;
        while(i<arr.length){
            if(arr[i]=="joe"){
                System.out.println(i);
            }
            i++;
            
        }
    }    
}
