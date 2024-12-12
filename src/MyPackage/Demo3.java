package MyPackage;

public class Demo3 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        demo.printMessage("validKey"); // Правильное значение
        demo.printMessage(null); // Нулевое значение
    }
}