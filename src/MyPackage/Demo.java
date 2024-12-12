package MyPackage;

public class Demo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.getDetails(null);
    }
}