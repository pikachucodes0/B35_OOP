package week7;
// Make a class Dog
// Make a private attribute name and age
// Make a public attribute breed
// Make setter for name and age
// Make getter for name and age
// Make an Object for dog
// Fill all attribute
// Print the following using object
// Name: XYZ
// Breed: ABC
// Age: 10

public class AccessModifier {
    public static void main(String[] args) {
        
        Dog dog= new Dog();
        dog.setAge(12);
        dog.setName("I dog");
        dog.breed= "kukur";
        System.out.println("Breed: "+dog.breed+"\nName: "+dog.getName()+"\nDog age: "+dog.getAge());
    }
}

class Dog{
    private String name;
    private int age;
    public String breed;
    void setName(String n){ //setter
        name=n; 
    }
    void setAge(int a){ //setter
        age=a; 
    }

    String getName(){ //getter
        return name;
    }
    int getAge(){ //getter
        return age;
    }


}
