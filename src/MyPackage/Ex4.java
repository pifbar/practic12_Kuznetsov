package MyPackage;

import java.util.Scanner;
public class Ex4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred");
        } finally {
            System.out.println("This will always execute");
        }
    }
    public static void main(String[] args) {
        Ex4 exception = new Ex4();
        exception.exceptionDemo();
    }
}