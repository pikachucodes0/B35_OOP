package week6;
/*make and array list as student as follows
 * ["arya","shree","yudi","anj","Niks","Lris"]
 * make 2 other arraylist males and females
 * loop the student ArrayList
 * add "niks","yudi""lris" in male
 * add "arya","shree","anj"
 * print arya from female
 * print yudi from male
 */

import java.util.ArrayList;

public class ArrayListLoop {
         public static void main(String[] args) {
        /**Import arraylist from java.util at the top
         * cannot use primitive data type, use wrapper for it
        */
        ArrayList<String> strArr= new ArrayList<>();
        /*to add on array list */
        strArr.add("arya");
        strArr.add("shree");
        strArr.add("yudi");
        strArr.add("anj");
        strArr.add("niks");
        strArr.add("lris");
        /*To loop ArrayList, same as array. get lenth first
         * to get length use .size()
         */
        
        ArrayList<String> male=new ArrayList<>();
        ArrayList<String> female=new ArrayList<>();
        
        // using for loop
        for(int index=0;index<strArr.size();index++){
            String Value= strArr.get(index);
            if(Value=="arya" ||Value=="shree"||Value=="anj"){

               female.add(Value);
            }
            else{
                male.add(Value);
            }
        }
        System.out.println(male);
        System.out.println(female);
        
        //using for each
        for(String value:strArr){
            if(value=="arya" ||value=="shree"||value=="anj"){
                
                female.add(value);
            }
            else{
                male.add(value);
            }
            System.out.println(male);
            System.out.println(female);
            };


    }
    
}
