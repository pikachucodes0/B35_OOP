package week7;
/*make a function modify() that takes new color and set to old color
    make a function expiry() that returns 100 added to year
    make a function start() that prints (name is starting)
    make a function stop() that print (name, brand is stopping)
    make a function detail() that print ( name, brand, color and year)
    make 3 Object of Car
    Start all 3 object
    Stop only 1st object
    Modify 2nd car to Green color
    print the expiry of 3rd object
    print detail of all 3 object */
public class CarOOP {
    public static void main(String[] args) {

        Car car= new Car();
        car.name="Mustang GT";
        car.brand="Ford";
        car.color="Black";
        car.date=2024;
        
        System.out.println("Expiration date is "+car.expiry());
        car.modify("barbie");
        car.detail();
        
        car.start();
        car.stop();
    }

}

class Car{
    String color,name,brand;
    int date;

    void modify(String newColor){
        color= newColor;
    }
    
    int expiry(){
        int sxp= date+100;
        return sxp;
    }
    
    void start(){
        System.out.println(name+" has started");
    }
    void stop(){
        System.out.println(name+","+brand+" is stopping");
    }
    void detail(){
        System.out.println(name+","+brand+","+color);
    }
}