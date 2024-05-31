package week6;
/*
 * Make the following array
 * ["a","b","c"]
 * ["m","n",'o']
 * ["x","y","z"]
 * 
 * print the names
 * also, find on which array 'y'is 
 * 
 * output:2
 */
public class mutliDarrayloop {
    public static void main(String[] args) {
        String[][] threeArray= {
        {"a","b","c"},
        {"m","n","o"},
        {"x","y","z"}
        };
        
        for(int i=0;i<threeArray.length;i++){
            for(int j=0;j<threeArray[i].length;i++){
                System.out.println(threeArray[i][j]+" ");

                String target="x";
                if(threeArray[i][j]==target){
                    System.out.println("Found "+i);
                }
            }
        
    }
        
    }
    
}
