package MyPackage;

public class Ex1 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        Ex1 exception = new Ex1();
        exception.exceptionDemo();
    }
}