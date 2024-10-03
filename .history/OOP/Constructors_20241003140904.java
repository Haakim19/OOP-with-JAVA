class item{
    public item(){
        System.out.println("This is a constructor.");
    }
    public void display (){
        System.out.println("This is a display method.");
    }
}
public class Constructors {
    public static void main(String[] args) {
        item item1 = new item();
        item1.display();
    }
}
