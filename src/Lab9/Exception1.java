public class Exception1 {
    public void exceptionDemo() {
        try {

            System.out.println(2 / 0); // Если 2.0/0.0 то Inf
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }


}
