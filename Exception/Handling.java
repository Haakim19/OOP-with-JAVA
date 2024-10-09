public class Handling {
    public static void main(String[] args) {
        // int a = 10, b = 0 , result = 0;
        // try {
        //     result = a / b;
        // } catch (ArithmeticException ee) {
        //     System.err.println(ee.toString());
        // }
        int[] num = new int[5];
        try {
            num[0] = 10;
            num[6] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.toString());
        }
    }
}
