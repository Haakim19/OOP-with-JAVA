public class Encapsulation {
    private String name = "zoro";

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        // myObj.setName("John");
        System.out.println(myObj.name);
    }
}
