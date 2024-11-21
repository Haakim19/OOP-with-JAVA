package oopclass;
class calculator{
    public int getAdd(int a, int b){
        return (a + b);
    }
}

public class DriverClass {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.getAdd(10, 20));
    }
}