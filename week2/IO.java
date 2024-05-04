package week2;
public class IO {

    public static void main(String[] args) {
        
        if(args.length<2){
        System.out.println("This returns arguments passed");
        return;
        }

        String name = args[0];
        System.out.println("You are "+name);

    }
}

