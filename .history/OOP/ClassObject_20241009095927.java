public class ClassObject {
    //Create a run method
    public void run(String name) {
        System.out.println(name + " can run faster");
    }
    //Create a eat method
    public void eat(String name){
        System.out.println(name + " eats a lot");
    }

    //inside the main, call the methods on the object
    public static void main (String[] args){
        ClassObject men = new ClassObject();
        men.run("Zoro");
        men.eat("Joyboy");
    }
}