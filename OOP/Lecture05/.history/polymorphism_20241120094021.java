class calculator {
    calculator() {
    }

    public int getAdd(int var1, int var2) {
        return var1 + var2;
    }
}

public class Polymorphism {
    public Polymorphism() {
    }
    public static void main(String[] var0) {
       calculator var1 = new calculator();
       System.out.println(var1.getAdd(10, 20));
    }
 }