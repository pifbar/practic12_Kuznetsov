package MyPackage;

import java.util.Scanner;

public class Demo1 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.getKey();
    }
}