public class enumMethod {
    enum Color {
        RED, GREEN, BLUE
    }
    
    public class Main {
        public static void main(String[] args) {
            Color favoriteColor = Color.BLUE;
            System.out.println("My favorite color is: " + favoriteColor);
    
            // Iterate through all enum constants
            for (Color color : Color.values()) {
                System.out.println(color);
            }
        }
    }
    
}
