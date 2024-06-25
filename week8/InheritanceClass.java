package week8;

public class InheritanceClass {
    public static void main(String[] args) {
        Labrador l=new Labrador();
        l.name="Ishan";
        l.breed="Lab";
        l.country="Germany";
        l.color="BLACK";

        l.speaks();
        l.fur();
        l.barks();
        l.play();

        
    }
    
}
class Animal{
    public String name;
    void speaks(){
        System.out.println("animal name: "+name);
    }
}
class Mammal extends Animal{
    public String breed;
    void fur(){
       System.out.println("Breed "+breed); 
    }
}
class Dog extends Mammal{
    public String country;
    void barks(){
       System.out.println("Where is it from? "+country); 
    }
}
class Cat extends Mammal{
    public String origin;
    void meows(){
       System.out.println("Where is it from "+origin); 
    }
}
class Labrador extends Dog{
    public String color;
    void play(){
        System.out.println("the dog's color is "+color);
    }
}
class GermanShephard extends Dog{
    public Boolean spot;
    void guard(){
        System.out.println("it has spot?: "+spot);
    }  
}
class Reptile extends Animal{
    public Boolean egg;
    void sheds(){
       System.out.println("It lays eggs?: "+egg); 
    }
}
class amphibian extends Reptile{
    public boolean scale;
    void swims(){
        System.out.println("Does it swim?: "+scale);
    }
}