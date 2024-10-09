public class Handling {
    public static void main(String[] args) {
        int a = 10, b = 0 , result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.err.println(e.toString());
        }
    }
}
