package week6;
import java.util.*;
/*make  arraylist of the following
 * ["apple","banana","water melon","pineapple"]
 * add "grape" to index 1
 * remove orange
 * remove water melon
 * add pear to 0th index
 * change pineapple to avacadp
 * change apple to cherry
 */

public class ArrayListClass {
    
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        /*add() with add elemet to list */
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("watermelon");
        arrayList.add("pineapple");
        System.out.println(arrayList);

        /*using index to add */
        arrayList.add(1,"grape");
        System.out.println(arrayList);

        /*remove(index OR element) */
        arrayList.remove("watermelon");
        System.out.println(arrayList);

        /*adding with index again */
        arrayList.add(0,"pear");
        System.out.println(arrayList);

        /*using set(index,element) to change the value */
        arrayList.set(3,"avacado");
        System.out.println(arrayList);

        arrayList.set(1,"cherry");
        System.out.println(arrayList);

}
}