package Week9;

public class ExceptionHandling {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = number1 - 10;
        String[] names = new String[100];
        names[0] = "Ram";
        try {
            int number3 = number1 / number2;
        } catch (ArithmeticException ae) {
            System.out.println("Zero Division error");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException np) {
            System.out.println("Null name variable");
        }
        try {
            names[110] = "Shyam";

        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Program end");

    }
}
