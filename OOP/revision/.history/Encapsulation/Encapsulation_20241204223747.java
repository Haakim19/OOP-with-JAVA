package encapsulation;
class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("Ahamed");
        System.out.println(p1.getName());
        p2.setName("Haakim");
        System.out.println(p2.getName());
    }
}