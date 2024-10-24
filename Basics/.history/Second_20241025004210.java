public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        myObj.myPublicMethod();
        Main.myStaticMethod();// Call the static method on the class itself
    }
}
