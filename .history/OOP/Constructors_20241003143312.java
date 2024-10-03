// class item{
//     public item(){ //? Default constructor
//         System.out.println("This is a constructor.");
//     }
//     public void display (){
//         System.out.println("This is a display method.");
//     }
// }
class item {
    int itemNo;
    double itemPrice;
    public item (int a ,double b){
        itemNo = a;
        itemPrice = b;
    }
}
public class Constructors {
    public static void main(String[] args) {
        item item1 = new item(2,100);
        System.out.println(item1.itemNo);
        System.out.println(item1.itemPrice);
    }
}
