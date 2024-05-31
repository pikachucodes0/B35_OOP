package week6;

import java.util.Scanner;

/*Make a function that takes array of string and string as parameter
 * returns index of 2nd argument value matches any elemet of array
 * else return -1
 * print the returned index
 */
public class finderArray {
    public String arrayFinder(String[] arr,String find){
        int i=0;
        while(i<arr.length){
            if(arr[i]==find){
                return i;
            }
        }
        return -1;

    }
    
    public static void main(String[] args) {
        String[] str={"apple","banana","mango","grape"};
        int arrayLength= str.length;
        System.out.println("Enter array");
        Scanner sc=new Scanner(System.in);
        String b= sc.nextLine();
        System.out.println(arrayFinder(str,b));

        
    }
    
}
