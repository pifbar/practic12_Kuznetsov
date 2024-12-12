package MyPackage;

import java.util.Scanner;

public class Ex3 {
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
        }
    }
    public static void main(String[] args) {
        Ex3 exception = new Ex3();
        exception.exceptionDemo();
    }
}