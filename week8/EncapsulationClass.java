package week8;

    // Make a constructer of Laptop that takes brand and name
    // Make a setter and getter for remaining private attributes, ram, storage
    // Make a function upgrade() takes, 2 number for ram and storage \
    // and add them to the current value of ram and storage
    // Make a function inflation() takes 1 number price \
    // and add to the current value of price
    // Make 2 object, fill the attribute and call upgrade & inflation
    // Print the following
    // Output
    // Brand: Apple
    // Name: Apple Air M3
    // Price: 150000
    // Ram: 10GB
    // Storage: 256GB
    // Year: 2022
public class EncapsulationClass {
    public static void main(String[] args) {
        Laptop laptop= new Laptop();
        laptop.brand="Asus";
        laptop.name="TUF2021";
        laptop.year=2021;
        laptop.setPrice(120000.00);
        laptop.setRam(256);
        laptop.setStorage(10);
        laptop.inflation(500000);
        laptop.upgrade(2, 128);



        System.out.println("Name:"+laptop.name+"\nBrand:"+laptop.brand+"\nPrice: "+laptop.getPrice()+"\nRam: "+laptop.getRam()
        +"\nStorage: "+laptop.getStorage()+"\nyear: "+laptop.year);
    }
}

//1.Encapsillation enclose/bundles similar properties/attribute
// and fuction/mthods inside a s single class

class Laptop{
    String brand;
    String name;
    //2. Data hiding can be done using a private modifier
    private double price;
    private int ram;
    private int storage;
    public int year;


    //3. Data attributes can have a better control using setter/getter
    public void setPrice(double price){
        this.price= price;
    }

    //read only using getter
    public double getPrice(){
        return this.price;
    }
    void branding(){
        System.out.println("brand: "+brand);
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getRam(){
        return this.ram;
    }
    public void setStorage(int s){
        this.storage=s;
    }
    public int getStorage(){
        return this.storage;
    }
    public void upgrade(int ram,int storage){
        this.ram=this.ram+ram;
        this.storage+= storage;
    }

    public void inflation(double price){
        this.price+=price;
    }
   
}
