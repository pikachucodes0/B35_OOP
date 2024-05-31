package week7;
// Make a class Cat
// Make 2 private attribute name, age
// Make 2 public attribute breed, color
// Make a constructor to only set name and age
// Make getter for name and age
// Make a setter for age
// Make an Object of cat
// Fill the attributes
// Add +1 to the current age
// Print the Following using object
// Name: Ny
// Age: 4
// Breed: Xy
// Color: Orange 
public class ConstructorClass {
    public static void main(String[] args) {
        cat c= new cat("Ny", 4);
        c.breed="Xy";
        c.color="Orange";
        c.setAge(c.getAge()+1);
        System.out.println("Name:"+c.getName());
        System.out.println("Age:"+c.getAge());
        System.out.println("Breed:"+c.breed);
        System.out.println("Color:"+c.color);
    }
    
}

class cat{
    private String name;
    private int age;
    public String breed,color;
   
    cat(String n, int ag){
        this.name=n;
        this.age=ag;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }



}

