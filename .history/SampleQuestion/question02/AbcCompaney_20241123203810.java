package question02;
class car{
    car(){
        private String rNumber,model,brand;
        private boolean isAvilable = true;
        
    }
    public void test(){
        System.out.println("bye");
    }
}
public class AbcCompaney {
    public static void main(String[] args) {
        car obj1 = new car("E001", "i8", "Audi");
        obj1.test();
    }
}
