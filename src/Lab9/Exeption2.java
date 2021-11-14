import java.util.Scanner;

public class Exeption2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i); //Qwerty - java.lang.NumberFormatException, 0 - java.lang.ArithmeticException, 1.2 - java.lang.NumberFormatException, 1 - 2
//        } catch (Exception err) { Ошибка, так как этот катч должен быть в конце
//            System.out.println("Error!");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException er) {
            System.out.println("Wrong number's format");
        } finally {
            System.out.println("I'm alive!");
        }
    }
}
